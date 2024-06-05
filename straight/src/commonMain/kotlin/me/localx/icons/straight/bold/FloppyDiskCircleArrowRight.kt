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

public val Icons.Bold.FloppyDiskCircleArrowRight: ImageVector
    get() {
        if (_floppyDiskCircleArrowRight != null) {
            return _floppyDiskCircleArrowRight!!
        }
        _floppyDiskCircleArrowRight = Builder(name = "FloppyDiskCircleArrowRight", defaultWidth =
                512.0.dp, defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.14f, 19.0f)
                curveToRelative(0.19f, 1.09f, 0.59f, 2.1f, 1.16f, 3.0f)
                lineTo(0.0f, 22.0f)
                lineTo(0.0f, 3.5f)
                curveTo(0.0f, 1.57f, 1.57f, 0.0f, 3.5f, 0.0f)
                horizontalLineToRelative(12.74f)
                lineToRelative(5.76f, 5.76f)
                verticalLineToRelative(4.54f)
                curveToRelative(-0.9f, -0.56f, -1.91f, -0.96f, -3.0f, -1.16f)
                verticalLineToRelative(-2.14f)
                lineTo(15.0f, 3.0f)
                lineTo(15.0f, 7.0f)
                lineTo(5.0f, 7.0f)
                lineTo(5.0f, 3.0f)
                horizontalLineToRelative(-1.5f)
                curveToRelative(-0.28f, 0.0f, -0.5f, 0.22f, -0.5f, 0.5f)
                verticalLineToRelative(15.5f)
                horizontalLineToRelative(6.14f)
                close()
                moveTo(24.0f, 17.5f)
                curveToRelative(0.0f, 3.59f, -2.91f, 6.5f, -6.5f, 6.5f)
                reflectiveCurveToRelative(-6.5f, -2.91f, -6.5f, -6.5f)
                reflectiveCurveToRelative(2.91f, -6.5f, 6.5f, -6.5f)
                reflectiveCurveToRelative(6.5f, 2.91f, 6.5f, 6.5f)
                close()
                moveTo(21.71f, 16.79f)
                lineToRelative(-3.71f, -3.79f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(3.0f)
                lineToRelative(3.71f, -3.79f)
                curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f)
                close()
                moveTo(7.0f, 12.5f)
                curveToRelative(0.0f, 1.47f, 0.9f, 2.72f, 2.18f, 3.24f)
                curveToRelative(0.49f, -2.34f, 1.96f, -4.33f, 3.95f, -5.52f)
                curveToRelative(-0.64f, -0.74f, -1.58f, -1.22f, -2.63f, -1.22f)
                curveToRelative(-1.93f, 0.0f, -3.5f, 1.57f, -3.5f, 3.5f)
                close()
            }
        }
        .build()
        return _floppyDiskCircleArrowRight!!
    }

private var _floppyDiskCircleArrowRight: ImageVector? = null
