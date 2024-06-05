package me.localx.icons.rounded.bold

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

public val Icons.Bold.ClipboardUser: ImageVector
    get() {
        if (_clipboardUser != null) {
            return _clipboardUser!!
        }
        _clipboardUser = Builder(name = "ClipboardUser", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(9.5f, 10.5f)
                curveToRelative(0.0f, -1.379f, 1.121f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.121f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.121f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.121f, -2.5f, -2.5f)
                close()
                moveTo(12.0f, 14.0f)
                curveToRelative(-2.319f, 0.0f, -4.408f, 1.577f, -4.969f, 3.75f)
                curveToRelative(-0.077f, 0.299f, -0.011f, 0.618f, 0.179f, 0.862f)
                curveToRelative(0.189f, 0.244f, 0.48f, 0.387f, 0.79f, 0.387f)
                horizontalLineToRelative(8.0f)
                curveToRelative(0.31f, 0.0f, 0.601f, -0.143f, 0.79f, -0.387f)
                curveToRelative(0.189f, -0.245f, 0.256f, -0.563f, 0.179f, -0.862f)
                curveToRelative(-0.561f, -2.173f, -2.649f, -3.75f, -4.969f, -3.75f)
                close()
                moveTo(22.0f, 7.5f)
                verticalLineToRelative(11.0f)
                curveToRelative(0.0f, 3.033f, -2.467f, 5.5f, -5.5f, 5.5f)
                lineTo(7.5f, 24.0f)
                curveToRelative(-3.033f, 0.0f, -5.5f, -2.467f, -5.5f, -5.5f)
                lineTo(2.0f, 7.5f)
                curveToRelative(0.0f, -2.978f, 2.379f, -5.411f, 5.337f, -5.498f)
                curveToRelative(0.562f, -1.183f, 1.769f, -2.002f, 3.163f, -2.002f)
                horizontalLineToRelative(3.0f)
                curveToRelative(1.395f, 0.0f, 2.601f, 0.819f, 3.163f, 2.002f)
                curveToRelative(2.958f, 0.086f, 5.337f, 2.52f, 5.337f, 5.498f)
                close()
                moveTo(19.0f, 7.5f)
                curveToRelative(0.0f, -1.378f, -1.122f, -2.5f, -2.5f, -2.5f)
                horizontalLineToRelative(-1.0f)
                curveToRelative(-0.829f, 0.0f, -1.5f, -0.671f, -1.5f, -1.5f)
                curveToRelative(0.0f, -0.276f, -0.224f, -0.5f, -0.5f, -0.5f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(-0.276f, 0.0f, -0.5f, 0.224f, -0.5f, 0.5f)
                curveToRelative(0.0f, 0.829f, -0.671f, 1.5f, -1.5f, 1.5f)
                horizontalLineToRelative(-1.0f)
                curveToRelative(-1.378f, 0.0f, -2.5f, 1.122f, -2.5f, 2.5f)
                verticalLineToRelative(11.0f)
                curveToRelative(0.0f, 1.378f, 1.122f, 2.5f, 2.5f, 2.5f)
                horizontalLineToRelative(9.0f)
                curveToRelative(1.378f, 0.0f, 2.5f, -1.122f, 2.5f, -2.5f)
                lineTo(19.0f, 7.5f)
                close()
            }
        }
        .build()
        return _clipboardUser!!
    }

private var _clipboardUser: ImageVector? = null
