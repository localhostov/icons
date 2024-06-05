package me.localx.icons.straight.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.straight.Icons

public val Icons.Bold.PriorityImportance: ImageVector
    get() {
        if (_priorityImportance != null) {
            return _priorityImportance!!
        }
        _priorityImportance = Builder(name = "PriorityImportance", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 4.0f)
                lineTo(7.0f, 4.0f)
                lineTo(7.0f, 1.0f)
                horizontalLineToRelative(17.0f)
                verticalLineToRelative(3.0f)
                close()
                moveTo(11.0f, 10.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(-3.0f)
                close()
                moveTo(0.0f, 5.0f)
                horizontalLineToRelative(5.0f)
                lineTo(5.0f, 0.0f)
                lineTo(0.0f, 0.0f)
                verticalLineToRelative(5.0f)
                close()
                moveTo(0.0f, 14.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(-5.0f)
                lineTo(0.0f, 9.0f)
                verticalLineToRelative(5.0f)
                close()
                moveTo(7.0f, 22.005f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-7.0f)
                verticalLineToRelative(3.0f)
                close()
                moveTo(0.005f, 23.0f)
                horizontalLineToRelative(4.995f)
                verticalLineToRelative(-5.0f)
                lineTo(0.005f, 18.0f)
                verticalLineToRelative(5.0f)
                close()
                moveTo(24.039f, 10.461f)
                lineToRelative(-3.729f, -3.729f)
                curveToRelative(-0.972f, -0.973f, -2.559f, -0.975f, -3.534f, 0.0f)
                lineToRelative(-3.771f, 3.771f)
                lineToRelative(2.121f, 2.121f)
                lineToRelative(1.918f, -1.918f)
                verticalLineToRelative(13.293f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-13.293f)
                lineToRelative(1.875f, 1.875f)
                lineToRelative(2.121f, -2.121f)
                close()
            }
        }
        .build()
        return _priorityImportance!!
    }

private var _priorityImportance: ImageVector? = null
