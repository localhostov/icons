package me.localx.icons.rounded.filled

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

public val Icons.Filled.PhotoVideo: ImageVector
    get() {
        if (_photoVideo != null) {
            return _photoVideo!!
        }
        _photoVideo = Builder(name = "PhotoVideo", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.971f, 6.578f)
                curveToRelative(0.817f, -0.681f, 1.975f, -0.627f, 2.711f, 0.111f)
                lineToRelative(0.475f, 0.479f)
                lineToRelative(4.962f, -4.994f)
                curveToRelative(-0.902f, -1.312f, -2.411f, -2.175f, -4.119f, -2.175f)
                horizontalLineToRelative(-6.0f)
                curveToRelative(-2.757f, 0.0f, -5.0f, 2.243f, -5.0f, 5.0f)
                verticalLineToRelative(4.0f)
                curveToRelative(0.0f, 1.057f, 0.334f, 2.035f, 0.896f, 2.843f)
                lineToRelative(6.075f, -5.265f)
                close()
                moveTo(11.487f, 2.115f)
                curveToRelative(0.828f, 0.0f, 1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                close()
                moveTo(24.0f, 5.0f)
                verticalLineToRelative(4.0f)
                curveToRelative(0.0f, 2.757f, -2.243f, 5.0f, -5.0f, 5.0f)
                horizontalLineToRelative(-6.0f)
                curveToRelative(-0.974f, 0.0f, -1.877f, -0.291f, -2.646f, -0.775f)
                lineToRelative(5.909f, -5.126f)
                lineToRelative(0.476f, 0.48f)
                curveToRelative(0.779f, 0.779f, 2.049f, 0.779f, 2.83f, -0.002f)
                lineToRelative(4.351f, -4.374f)
                curveToRelative(0.042f, 0.261f, 0.081f, 0.524f, 0.081f, 0.797f)
                close()
                moveTo(17.0f, 16.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, 0.448f, -1.0f, 1.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -0.558f, -0.455f, -0.999f, -1.012f, -1.0f)
                curveToRelative(-3.263f, -0.006f, -5.995f, -2.245f, -6.764f, -5.27f)
                curveToRelative(-0.11f, -0.434f, -0.511f, -0.73f, -0.958f, -0.73f)
                horizontalLineToRelative(-0.766f)
                curveToRelative(-2.485f, 0.0f, -4.5f, 2.015f, -4.5f, 4.5f)
                verticalLineToRelative(5.0f)
                curveToRelative(0.0f, 2.485f, 2.015f, 4.5f, 4.5f, 4.5f)
                lineTo(13.5f, 24.0f)
                curveToRelative(2.485f, 0.0f, 4.5f, -2.015f, 4.5f, -4.5f)
                verticalLineToRelative(-2.5f)
                curveToRelative(0.0f, -0.552f, -0.448f, -1.0f, -1.0f, -1.0f)
                close()
                moveTo(2.0f, 16.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                lineTo(2.0f, 18.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(4.0f, 12.05f)
                verticalLineToRelative(1.95f)
                horizontalLineToRelative(-1.945f)
                curveToRelative(0.2f, -0.977f, 0.968f, -1.75f, 1.945f, -1.95f)
                close()
                moveTo(2.055f, 20.0f)
                horizontalLineToRelative(1.945f)
                verticalLineToRelative(1.95f)
                curveToRelative(-0.978f, -0.199f, -1.745f, -0.972f, -1.945f, -1.95f)
                close()
                moveTo(14.0f, 21.949f)
                verticalLineToRelative(-1.949f)
                horizontalLineToRelative(1.945f)
                curveToRelative(-0.2f, 0.977f, -0.968f, 1.75f, -1.945f, 1.949f)
                close()
            }
        }
        .build()
        return _photoVideo!!
    }

private var _photoVideo: ImageVector? = null
