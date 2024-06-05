package me.localx.icons.straight.outline

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

public val Icons.Outline.FloppyDiskCircleArrowRight: ImageVector
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
                moveTo(2.0f, 19.0f)
                lineTo(2.0f, 3.0f)
                curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(11.0f)
                lineTo(16.0f, 2.82f)
                lineToRelative(3.0f, 3.0f)
                verticalLineToRelative(2.41f)
                curveToRelative(0.7f, 0.16f, 1.37f, 0.4f, 2.0f, 0.72f)
                verticalLineToRelative(-3.96f)
                lineTo(16.01f, 0.0f)
                lineTo(3.0f, 0.0f)
                curveTo(1.35f, 0.0f, 0.0f, 1.35f, 0.0f, 3.0f)
                lineTo(0.0f, 21.0f)
                lineTo(8.95f, 21.0f)
                curveToRelative(-0.31f, -0.63f, -0.56f, -1.3f, -0.72f, -2.0f)
                lineTo(2.0f, 19.0f)
                close()
                moveTo(7.0f, 6.0f)
                lineTo(7.0f, 2.0f)
                horizontalLineToRelative(7.0f)
                lineTo(14.0f, 6.0f)
                lineTo(7.0f, 6.0f)
                close()
                moveTo(10.5f, 10.0f)
                curveToRelative(0.26f, 0.0f, 0.5f, 0.03f, 0.74f, 0.08f)
                curveToRelative(-1.74f, 1.45f, -2.92f, 3.55f, -3.19f, 5.92f)
                curveToRelative(-0.65f, -0.64f, -1.06f, -1.52f, -1.06f, -2.5f)
                curveToRelative(0.0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                close()
                moveTo(17.0f, 10.0f)
                curveToRelative(-3.86f, 0.0f, -7.0f, 3.14f, -7.0f, 7.0f)
                reflectiveCurveToRelative(3.14f, 7.0f, 7.0f, 7.0f)
                reflectiveCurveToRelative(7.0f, -3.14f, 7.0f, -7.0f)
                reflectiveCurveToRelative(-3.14f, -7.0f, -7.0f, -7.0f)
                close()
                moveTo(17.0f, 22.0f)
                curveToRelative(-2.76f, 0.0f, -5.0f, -2.24f, -5.0f, -5.0f)
                reflectiveCurveToRelative(2.24f, -5.0f, 5.0f, -5.0f)
                reflectiveCurveToRelative(5.0f, 2.24f, 5.0f, 5.0f)
                reflectiveCurveToRelative(-2.24f, 5.0f, -5.0f, 5.0f)
                close()
                moveTo(19.41f, 15.59f)
                curveToRelative(0.78f, 0.78f, 0.78f, 2.05f, 0.0f, 2.83f)
                lineToRelative(-2.17f, 2.17f)
                lineToRelative(-1.41f, -1.41f)
                lineToRelative(1.17f, -1.17f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(3.0f)
                lineToRelative(-1.09f, -1.09f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(2.09f, 2.09f)
                close()
            }
        }
        .build()
        return _floppyDiskCircleArrowRight!!
    }

private var _floppyDiskCircleArrowRight: ImageVector? = null
