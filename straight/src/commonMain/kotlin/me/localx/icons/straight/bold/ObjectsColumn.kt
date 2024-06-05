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

public val Icons.Bold.ObjectsColumn: ImageVector
    get() {
        if (_objectsColumn != null) {
            return _objectsColumn!!
        }
        _objectsColumn = Builder(name = "ObjectsColumn", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(0.0f, 3.5f)
                verticalLineToRelative(5.5f)
                horizontalLineToRelative(11.0f)
                lineTo(11.0f, 0.0f)
                lineTo(3.5f, 0.0f)
                curveTo(1.57f, 0.0f, 0.0f, 1.57f, 0.0f, 3.5f)
                close()
                moveTo(8.0f, 6.0f)
                lineTo(3.0f, 6.0f)
                verticalLineToRelative(-2.5f)
                curveToRelative(0.0f, -0.275f, 0.225f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(4.5f)
                verticalLineToRelative(3.0f)
                close()
                moveTo(13.0f, 24.0f)
                horizontalLineToRelative(7.5f)
                curveToRelative(1.93f, 0.0f, 3.5f, -1.57f, 3.5f, -3.5f)
                verticalLineToRelative(-5.5f)
                horizontalLineToRelative(-11.0f)
                verticalLineToRelative(9.0f)
                close()
                moveTo(16.0f, 18.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(2.5f)
                curveToRelative(0.0f, 0.275f, -0.225f, 0.5f, -0.5f, 0.5f)
                horizontalLineToRelative(-4.5f)
                verticalLineToRelative(-3.0f)
                close()
                moveTo(20.5f, 0.0f)
                horizontalLineToRelative(-7.5f)
                verticalLineToRelative(13.0f)
                horizontalLineToRelative(11.0f)
                lineTo(24.0f, 3.5f)
                curveToRelative(0.0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                close()
                moveTo(21.0f, 10.0f)
                horizontalLineToRelative(-5.0f)
                lineTo(16.0f, 3.0f)
                horizontalLineToRelative(4.5f)
                curveToRelative(0.275f, 0.0f, 0.5f, 0.225f, 0.5f, 0.5f)
                verticalLineToRelative(6.5f)
                close()
                moveTo(0.0f, 20.5f)
                curveToRelative(0.0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                horizontalLineToRelative(7.5f)
                verticalLineToRelative(-13.0f)
                lineTo(0.0f, 11.0f)
                verticalLineToRelative(9.5f)
                close()
                moveTo(3.0f, 14.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(7.0f)
                lineTo(3.5f, 21.0f)
                curveToRelative(-0.275f, 0.0f, -0.5f, -0.225f, -0.5f, -0.5f)
                verticalLineToRelative(-6.5f)
                close()
            }
        }
        .build()
        return _objectsColumn!!
    }

private var _objectsColumn: ImageVector? = null
