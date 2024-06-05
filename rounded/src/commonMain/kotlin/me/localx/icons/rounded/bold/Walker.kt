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

public val Icons.Bold.Walker: ImageVector
    get() {
        if (_walker != null) {
            return _walker!!
        }
        _walker = Builder(name = "Walker", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.0f, 17.337f)
                verticalLineTo(5.5f)
                curveToRelative(0.0f, -3.032f, -2.468f, -5.5f, -5.5f, -5.5f)
                horizontalLineToRelative(-4.681f)
                curveToRelative(-2.319f, 0.0f, -4.4f, 1.467f, -5.181f, 3.649f)
                lineTo(0.087f, 21.995f)
                curveToRelative(-0.278f, 0.78f, 0.129f, 1.639f, 0.908f, 1.918f)
                curveToRelative(0.167f, 0.06f, 0.337f, 0.087f, 0.505f, 0.087f)
                curveToRelative(0.616f, 0.0f, 1.193f, -0.382f, 1.413f, -0.995f)
                lineToRelative(3.93f, -11.005f)
                horizontalLineToRelative(12.157f)
                verticalLineToRelative(5.337f)
                curveToRelative(-1.182f, 0.562f, -2.0f, 1.767f, -2.0f, 3.163f)
                curveToRelative(0.0f, 1.933f, 1.567f, 3.5f, 3.5f, 3.5f)
                reflectiveCurveToRelative(3.5f, -1.567f, 3.5f, -3.5f)
                curveToRelative(0.0f, -1.396f, -0.818f, -2.601f, -2.0f, -3.163f)
                close()
                moveTo(7.914f, 9.0f)
                lineToRelative(1.55f, -4.342f)
                curveToRelative(0.354f, -0.991f, 1.3f, -1.658f, 2.354f, -1.658f)
                horizontalLineToRelative(4.681f)
                curveToRelative(1.379f, 0.0f, 2.5f, 1.121f, 2.5f, 2.5f)
                verticalLineToRelative(3.5f)
                horizontalLineTo(7.914f)
                close()
            }
        }
        .build()
        return _walker!!
    }

private var _walker: ImageVector? = null
