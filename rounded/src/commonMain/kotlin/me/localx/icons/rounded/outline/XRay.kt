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

public val Icons.Outline.XRay: ImageVector
    get() {
        if (_xRay != null) {
            return _xRay!!
        }
        _xRay = Builder(name = "XRay", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.0f, 22.0f)
                horizontalLineToRelative(-1.0f)
                lineTo(22.0f, 2.0f)
                horizontalLineToRelative(1.0f)
                curveToRelative(0.553f, 0.0f, 1.0f, -0.447f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.447f, -1.0f, -1.0f, -1.0f)
                lineTo(1.0f, 0.0f)
                curveTo(0.447f, 0.0f, 0.0f, 0.447f, 0.0f, 1.0f)
                reflectiveCurveToRelative(0.447f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(20.0f)
                horizontalLineToRelative(-1.0f)
                curveToRelative(-0.553f, 0.0f, -1.0f, 0.447f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.447f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(22.0f)
                curveToRelative(0.553f, 0.0f, 1.0f, -0.447f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.447f, -1.0f, -1.0f, -1.0f)
                close()
                moveTo(4.0f, 2.0f)
                horizontalLineToRelative(16.0f)
                verticalLineToRelative(20.0f)
                lineTo(4.0f, 22.0f)
                lineTo(4.0f, 2.0f)
                close()
                moveTo(17.85f, 15.653f)
                curveToRelative(-0.414f, -1.011f, -1.35f, -1.645f, -2.45f, -1.653f)
                horizontalLineToRelative(-2.399f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.553f, 0.0f, 1.0f, -0.447f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.447f, -1.0f, -1.0f, -1.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(4.0f)
                curveToRelative(0.553f, 0.0f, 1.0f, -0.447f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.447f, -1.0f, -1.0f, -1.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -0.553f, -0.447f, -1.0f, -1.0f, -1.0f)
                reflectiveCurveToRelative(-1.0f, 0.447f, -1.0f, 1.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-4.0f)
                curveToRelative(-0.553f, 0.0f, -1.0f, 0.447f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.447f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(-0.553f, 0.0f, -1.0f, 0.447f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.447f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-2.44f)
                curveToRelative(-1.087f, 0.009f, -2.018f, 0.639f, -2.43f, 1.645f)
                reflectiveCurveToRelative(-0.19f, 2.108f, 0.578f, 2.877f)
                lineToRelative(0.6f, 0.6f)
                curveToRelative(0.566f, 0.566f, 1.32f, 0.879f, 2.121f, 0.879f)
                horizontalLineToRelative(5.143f)
                curveToRelative(0.801f, 0.0f, 1.555f, -0.312f, 2.121f, -0.879f)
                lineToRelative(0.576f, -0.576f)
                curveToRelative(0.772f, -0.772f, 0.995f, -1.881f, 0.581f, -2.892f)
                close()
                moveTo(15.855f, 17.131f)
                lineToRelative(-0.576f, 0.576f)
                curveToRelative(-0.187f, 0.187f, -0.444f, 0.293f, -0.707f, 0.293f)
                horizontalLineToRelative(-5.143f)
                curveToRelative(-0.263f, 0.0f, -0.521f, -0.106f, -0.707f, -0.293f)
                lineToRelative(-0.6f, -0.6f)
                curveToRelative(-0.275f, -0.275f, -0.19f, -0.585f, -0.142f, -0.705f)
                curveToRelative(0.049f, -0.119f, 0.206f, -0.399f, 0.62f, -0.402f)
                horizontalLineToRelative(6.791f)
                curveToRelative(0.397f, 0.003f, 0.558f, 0.289f, 0.607f, 0.411f)
                curveToRelative(0.051f, 0.123f, 0.137f, 0.438f, -0.145f, 0.72f)
                close()
            }
        }
        .build()
        return _xRay!!
    }

private var _xRay: ImageVector? = null
