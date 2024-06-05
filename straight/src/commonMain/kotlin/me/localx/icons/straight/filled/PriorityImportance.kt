package me.localx.icons.straight.filled

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

public val Icons.Filled.PriorityImportance: ImageVector
    get() {
        if (_priorityImportance != null) {
            return _priorityImportance!!
        }
        _priorityImportance = Builder(name = "PriorityImportance", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 2.0f)
                verticalLineToRelative(2.0f)
                lineTo(8.0f, 4.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(16.0f)
                close()
                moveTo(13.0f, 11.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(0.0f, 0.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(6.004f)
                lineTo(0.0f, 6.004f)
                lineTo(0.0f, 0.0f)
                close()
                moveTo(0.0f, 9.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(6.004f)
                lineTo(0.0f, 15.004f)
                verticalLineToRelative(-6.004f)
                close()
                moveTo(8.0f, 22.0f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-7.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(0.0f, 18.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(6.004f)
                lineTo(0.0f, 24.004f)
                verticalLineToRelative(-6.004f)
                close()
                moveTo(17.586f, 6.586f)
                lineToRelative(-3.58f, 3.579f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(2.58f, -2.579f)
                verticalLineToRelative(15.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-15.0f)
                lineToRelative(2.564f, 2.564f)
                lineToRelative(1.414f, -1.414f)
                lineToRelative(-3.564f, -3.564f)
                curveToRelative(-0.756f, -0.756f, -2.072f, -0.756f, -2.828f, 0.0f)
                close()
            }
        }
        .build()
        return _priorityImportance!!
    }

private var _priorityImportance: ImageVector? = null
