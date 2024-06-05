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

public val Icons.Outline.CloudHail: ImageVector
    get() {
        if (_cloudHail != null) {
            return _cloudHail!!
        }
        _cloudHail = Builder(name = "CloudHail", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 19.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -1.0f, -1.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 12.0f, 19.0f)
                close()
                moveTo(10.0f, 22.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 1.0f, 1.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 10.0f, 22.0f)
                close()
                moveTo(8.0f, 14.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 1.0f, 1.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 8.0f, 14.0f)
                close()
                moveTo(6.0f, 22.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 1.0f, 1.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 6.0f, 22.0f)
                close()
                moveTo(7.0f, 18.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 1.0f, 1.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 7.0f, 18.0f)
                close()
                moveTo(14.0f, 22.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 1.0f, 1.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 14.0f, 22.0f)
                close()
                moveTo(16.0f, 14.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 1.0f, 1.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 16.0f, 14.0f)
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
                moveTo(12.0f, 14.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 1.0f, 1.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 12.0f, 14.0f)
                close()
                moveTo(15.0f, 18.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 1.0f, 1.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 15.0f, 18.0f)
                close()
            }
        }
        .build()
        return _cloudHail!!
    }

private var _cloudHail: ImageVector? = null
