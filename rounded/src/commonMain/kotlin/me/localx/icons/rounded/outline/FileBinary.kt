package me.localx.icons.rounded.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.rounded.Icons

public val Icons.Outline.FileBinary: ImageVector
    get() {
        if (_fileBinary != null) {
            return _fileBinary!!
        }
        _fileBinary = Builder(name = "FileBinary", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.5f, 11.0f)
                curveToRelative(-1.93f, 0.0f, -3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                reflectiveCurveToRelative(3.5f, -1.57f, 3.5f, -3.5f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                close()
                moveTo(11.0f, 16.5f)
                curveToRelative(0.0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(18.0f, 12.0f)
                verticalLineToRelative(7.0f)
                curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.45f, -1.0f, -1.0f)
                verticalLineToRelative(-4.59f)
                lineToRelative(-0.29f, 0.29f)
                curveToRelative(-0.39f, 0.39f, -1.02f, 0.39f, -1.41f, 0.0f)
                reflectiveCurveToRelative(-0.39f, -1.02f, 0.0f, -1.41f)
                lineToRelative(2.0f, -2.0f)
                curveToRelative(0.29f, -0.29f, 0.72f, -0.37f, 1.09f, -0.22f)
                curveToRelative(0.37f, 0.15f, 0.62f, 0.52f, 0.62f, 0.92f)
                close()
                moveTo(19.95f, 5.54f)
                lineToRelative(-3.48f, -3.48f)
                curveToRelative(-1.32f, -1.32f, -3.08f, -2.05f, -4.95f, -2.05f)
                lineTo(7.0f, 0.01f)
                curveTo(4.24f, 0.0f, 2.0f, 2.24f, 2.0f, 5.0f)
                verticalLineToRelative(14.0f)
                curveToRelative(0.0f, 2.76f, 2.24f, 5.0f, 5.0f, 5.0f)
                horizontalLineToRelative(10.0f)
                curveToRelative(2.76f, 0.0f, 5.0f, -2.24f, 5.0f, -5.0f)
                lineTo(22.0f, 10.49f)
                curveToRelative(0.0f, -1.87f, -0.73f, -3.63f, -2.05f, -4.95f)
                close()
                moveTo(18.54f, 6.95f)
                curveToRelative(0.32f, 0.32f, 0.56f, 0.67f, 0.78f, 1.05f)
                horizontalLineToRelative(-4.32f)
                curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f)
                lineTo(14.0f, 2.68f)
                curveToRelative(0.38f, 0.22f, 0.74f, 0.47f, 1.05f, 0.78f)
                lineToRelative(3.48f, 3.48f)
                close()
                moveTo(20.0f, 19.0f)
                curveToRelative(0.0f, 1.65f, -1.35f, 3.0f, -3.0f, 3.0f)
                lineTo(7.0f, 22.0f)
                curveToRelative(-1.65f, 0.0f, -3.0f, -1.35f, -3.0f, -3.0f)
                lineTo(4.0f, 5.0f)
                curveToRelative(0.0f, -1.65f, 1.35f, -3.0f, 3.0f, -3.0f)
                horizontalLineToRelative(4.51f)
                curveToRelative(0.16f, 0.0f, 0.32f, 0.03f, 0.49f, 0.05f)
                lineTo(12.0f, 7.0f)
                curveToRelative(0.0f, 1.65f, 1.35f, 3.0f, 3.0f, 3.0f)
                horizontalLineToRelative(4.95f)
                curveToRelative(0.02f, 0.16f, 0.05f, 0.32f, 0.05f, 0.49f)
                verticalLineToRelative(8.51f)
                close()
            }
        }
        .build()
        return _fileBinary!!
    }

private var _fileBinary: ImageVector? = null
