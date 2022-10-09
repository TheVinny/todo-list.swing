/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import Controller.ProjectDTO;
import Controller.TaskDTO;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;
import model.Project;

/**
 *
 * @author vinny
 */
public class Home extends javax.swing.JFrame {

    ProjectDTO ProjectController;
    TaskDTO TaskController;
    
    DefaultListModel projectModel;
    
    public Home() {
        initComponents();
        decorateTableTask();
        initialData();
        initComponentsModel();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        emptyListPanel = new javax.swing.JPanel();
        noTaskText = new javax.swing.JLabel();
        noTaskTips = new javax.swing.JLabel();
        emptyListIcon = new javax.swing.JLabel();
        background = new javax.swing.JPanel();
        header = new javax.swing.JPanel();
        text = new javax.swing.JLabel();
        iconHeaderLabel = new javax.swing.JLabel();
        Projects = new javax.swing.JPanel();
        titleProjectList = new javax.swing.JLabel();
        titleIconProject = new javax.swing.JLabel();
        Tasks = new javax.swing.JPanel();
        taskTitleList = new javax.swing.JLabel();
        titleIconTask = new javax.swing.JLabel();
        taskListsPanel = new javax.swing.JPanel();
        tablePane = new javax.swing.JScrollPane();
        tableTaskList = new javax.swing.JTable();
        projectsListsPanel = new javax.swing.JPanel();
        listPanel = new javax.swing.JScrollPane();
        projectList = new javax.swing.JList<>();

        emptyListPanel.setBackground(new java.awt.Color(255, 255, 255));

        noTaskText.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        noTaskText.setForeground(new java.awt.Color(153, 0, 102));
        noTaskText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        noTaskText.setText("Ainda não há tarefas nesse projeto");

        noTaskTips.setForeground(new java.awt.Color(153, 0, 102));
        noTaskTips.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        noTaskTips.setText("Clique no botão '+' para adicionar uma tarefa");

        emptyListIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        emptyListIcon.setIcon(new javax.swing.ImageIcon("C:\\Users\\vinny\\Documents\\NetBeansProjects\\mytodo\\src\\main\\java\\assets\\Checklist.jpg")); // NOI18N

        javax.swing.GroupLayout emptyListPanelLayout = new javax.swing.GroupLayout(emptyListPanel);
        emptyListPanel.setLayout(emptyListPanelLayout);
        emptyListPanelLayout.setHorizontalGroup(
            emptyListPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(emptyListPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(emptyListPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(noTaskText, javax.swing.GroupLayout.DEFAULT_SIZE, 311, Short.MAX_VALUE)
                    .addComponent(noTaskTips, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addComponent(emptyListIcon, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        emptyListPanelLayout.setVerticalGroup(
            emptyListPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(emptyListPanelLayout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addComponent(emptyListIcon)
                .addGap(30, 30, 30)
                .addComponent(noTaskText)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(noTaskTips)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(600, 650));

        background.setBackground(new java.awt.Color(204, 204, 204));

        header.setBackground(new java.awt.Color(204, 0, 102));

        text.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        text.setForeground(new java.awt.Color(255, 255, 255));
        text.setText("To-Do List");

        iconHeaderLabel.setIcon(new javax.swing.ImageIcon("C:\\Users\\vinny\\Documents\\NetBeansProjects\\mytodo\\src\\main\\java\\assets\\to-do-list.png")); // NOI18N

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(iconHeaderLabel)
                .addGap(18, 18, 18)
                .addComponent(text)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(text, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(iconHeaderLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
        );

        Projects.setBackground(new java.awt.Color(255, 255, 255));

        titleProjectList.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        titleProjectList.setForeground(new java.awt.Color(153, 0, 102));
        titleProjectList.setText("Projects");

        titleIconProject.setIcon(new javax.swing.ImageIcon("C:\\Users\\vinny\\Documents\\NetBeansProjects\\mytodo\\src\\main\\java\\assets\\add.png")); // NOI18N
        titleIconProject.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        titleIconProject.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                titleIconProjectMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout ProjectsLayout = new javax.swing.GroupLayout(Projects);
        Projects.setLayout(ProjectsLayout);
        ProjectsLayout.setHorizontalGroup(
            ProjectsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ProjectsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titleProjectList)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(titleIconProject)
                .addContainerGap())
        );
        ProjectsLayout.setVerticalGroup(
            ProjectsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ProjectsLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(titleProjectList)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(titleIconProject, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        Tasks.setBackground(new java.awt.Color(255, 255, 255));

        taskTitleList.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        taskTitleList.setForeground(new java.awt.Color(153, 0, 102));
        taskTitleList.setText("Tasks");

        titleIconTask.setIcon(new javax.swing.ImageIcon("C:\\Users\\vinny\\Documents\\NetBeansProjects\\mytodo\\src\\main\\java\\assets\\add.png")); // NOI18N
        titleIconTask.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                titleIconTaskMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout TasksLayout = new javax.swing.GroupLayout(Tasks);
        Tasks.setLayout(TasksLayout);
        TasksLayout.setHorizontalGroup(
            TasksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TasksLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(taskTitleList)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 276, Short.MAX_VALUE)
                .addComponent(titleIconTask)
                .addContainerGap())
        );
        TasksLayout.setVerticalGroup(
            TasksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TasksLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(taskTitleList)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TasksLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titleIconTask, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        taskListsPanel.setBackground(new java.awt.Color(255, 255, 255));

        tableTaskList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Name", "Title", "Deadline", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableTaskList.setGridColor(new java.awt.Color(255, 255, 255));
        tableTaskList.setRowHeight(40);
        tableTaskList.setSelectionBackground(new java.awt.Color(153, 0, 102));
        tableTaskList.setShowVerticalLines(false);
        tablePane.setViewportView(tableTaskList);

        javax.swing.GroupLayout taskListsPanelLayout = new javax.swing.GroupLayout(taskListsPanel);
        taskListsPanel.setLayout(taskListsPanelLayout);
        taskListsPanelLayout.setHorizontalGroup(
            taskListsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tablePane, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        taskListsPanelLayout.setVerticalGroup(
            taskListsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tablePane, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        projectsListsPanel.setBackground(new java.awt.Color(255, 255, 255));

        projectList.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        projectList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        projectList.setFixedCellHeight(40);
        projectList.setSelectionBackground(new java.awt.Color(153, 0, 102));
        projectList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                projectListMouseClicked(evt);
            }
        });
        listPanel.setViewportView(projectList);

        javax.swing.GroupLayout projectsListsPanelLayout = new javax.swing.GroupLayout(projectsListsPanel);
        projectsListsPanel.setLayout(projectsListsPanelLayout);
        projectsListsPanelLayout.setHorizontalGroup(
            projectsListsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(projectsListsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(listPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        projectsListsPanelLayout.setVerticalGroup(
            projectsListsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(projectsListsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(listPanel)
                .addContainerGap())
        );

        javax.swing.GroupLayout backgroundLayout = new javax.swing.GroupLayout(background);
        background.setLayout(backgroundLayout);
        backgroundLayout.setHorizontalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(projectsListsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Projects, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(taskListsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Tasks, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(6, 6, 6))
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Projects, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Tasks, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(taskListsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(projectsListsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(11, 11, 11))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void titleIconProjectMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_titleIconProjectMouseClicked
       ProjectScreen projectScreen = new ProjectScreen(this, rootPaneCheckingEnabled);
       projectScreen.setVisible(true);
           projectScreen.addWindowListener(new WindowAdapter() {
        @Override
        public void windowClosed(WindowEvent e){
          loadProjects();
        }
      });
    }//GEN-LAST:event_titleIconProjectMouseClicked

    private void titleIconTaskMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_titleIconTaskMouseClicked
      TaskScreen taskScreen = new TaskScreen(this, rootPaneCheckingEnabled);
      taskScreen.setProject(null);
      taskScreen.setVisible(true);
    }//GEN-LAST:event_titleIconTaskMouseClicked

    private void projectListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_projectListMouseClicked
      System.out.println();
    }//GEN-LAST:event_projectListMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Java swing".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Projects;
    private javax.swing.JPanel Tasks;
    private javax.swing.JPanel background;
    private javax.swing.JLabel emptyListIcon;
    private javax.swing.JPanel emptyListPanel;
    private javax.swing.JPanel header;
    private javax.swing.JLabel iconHeaderLabel;
    private javax.swing.JScrollPane listPanel;
    private javax.swing.JLabel noTaskText;
    private javax.swing.JLabel noTaskTips;
    private javax.swing.JList<String> projectList;
    private javax.swing.JPanel projectsListsPanel;
    private javax.swing.JScrollPane tablePane;
    private javax.swing.JTable tableTaskList;
    private javax.swing.JPanel taskListsPanel;
    private javax.swing.JLabel taskTitleList;
    private javax.swing.JLabel text;
    private javax.swing.JLabel titleIconProject;
    private javax.swing.JLabel titleIconTask;
    private javax.swing.JLabel titleProjectList;
    // End of variables declaration//GEN-END:variables
   
    public void decorateTableTask() {
      tableTaskList.getTableHeader().setFont(new Font("Arial",Font.BOLD,14));
      tableTaskList.getTableHeader().setBackground(new Color(204,0,112));
      tableTaskList.getTableHeader().setForeground(Color.white);
      //gera uma auto organização das colunas
      tableTaskList.setAutoCreateRowSorter(true);
    }
    
    public void initialData() {
       ProjectController = new ProjectDTO();
       TaskController = new TaskDTO();
    }
    
    public void initComponentsModel() {
      projectModel = new DefaultListModel<Project>();
      loadProjects();
    }
    
    public void  loadProjects() {
      projectModel = new DefaultListModel<>();
      List<Project> projects = ProjectController.getAll();
      projectModel.clear();
      
        for (int i = 0; i < projects.size(); i++) {
          Project project = projects.get(i);
          projectModel.addElement(project);
        }
        projectList.setModel(projectModel);
      
    }
    
}
