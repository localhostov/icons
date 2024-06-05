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

public val Icons.Outline.CloudHailMixed: ImageVector
    get() {
        if (_cloudHailMixed != null) {
            return _cloudHailMixed!!
        }
        _cloudHailMixed = Builder(name = "CloudHailMixed", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 15.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -1.0f, -1.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 13.0f, 15.0f)
                close()
                moveTo(6.0f, 22.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 1.0f, 1.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 6.0f, 22.0f)
                close()
                moveTo(17.441f, 5.059f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 2.265f, 10.05f)
                arcTo(5.5f, 5.5f, 0.0f, false, false, 4.0f, 19.792f)
                verticalLineToRelative(-2.13f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, -0.089f, -6.282f)
                lineToRelative(0.8f, -0.408f)
                lineToRelative(-0.319f, -0.838f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 10.0f, 2.0f)
                arcToRelative(6.035f, 6.035f, 0.0f, false, true, 5.752f, 4.289f)
                lineToRelative(0.206f, 0.691f)
                lineTo(16.679f, 7.0f)
                arcTo(5.5f, 5.5f, 0.0f, false, true, 18.0f, 17.792f)
                verticalLineToRelative(2.057f)
                arcToRelative(7.5f, 7.5f, 0.0f, false, false, -0.559f, -14.79f)
                close()
                moveTo(9.22f, 14.242f)
                lineToRelative(-1.94f, -0.484f)
                lineToRelative(-1.5f, 6.0f)
                lineToRelative(1.94f, 0.484f)
                close()
                moveTo(14.0f, 22.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 1.0f, 1.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 14.0f, 22.0f)
                close()
                moveTo(17.22f, 14.242f)
                lineTo(15.28f, 13.758f)
                lineTo(13.78f, 19.758f)
                lineTo(15.72f, 20.242f)
                close()
                moveTo(12.286f, 18.012f)
                lineTo(10.346f, 17.527f)
                lineTo(8.846f, 23.527f)
                lineTo(10.786f, 24.012f)
                close()
            }
        }
        .build()
        return _cloudHailMixed!!
    }

private var _cloudHailMixed: ImageVector? = null
