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

public val Icons.Outline.UserSlash: ImageVector
    get() {
        if (_userSlash != null) {
            return _userSlash!!
        }
        _userSlash = Builder(name = "UserSlash", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.968f, 15.003f)
                curveToRelative(0.138f, 0.535f, -0.184f, 1.08f, -0.719f, 1.217f)
                curveToRelative(-3.091f, 0.796f, -5.25f, 3.583f, -5.25f, 6.78f)
                curveToRelative(0.0f, 0.552f, -0.448f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.448f, -1.0f, -1.0f)
                curveToRelative(0.0f, -4.109f, 2.776f, -7.693f, 6.75f, -8.716f)
                curveToRelative(0.539f, -0.137f, 1.08f, 0.184f, 1.218f, 0.719f)
                close()
                moveTo(23.707f, 23.707f)
                curveToRelative(-0.195f, 0.195f, -0.451f, 0.293f, -0.707f, 0.293f)
                reflectiveCurveToRelative(-0.512f, -0.098f, -0.707f, -0.293f)
                lineTo(0.293f, 1.707f)
                curveTo(-0.098f, 1.316f, -0.098f, 0.684f, 0.293f, 0.293f)
                reflectiveCurveTo(1.316f, -0.098f, 1.707f, 0.293f)
                lineTo(6.139f, 4.725f)
                curveTo(6.726f, 2.028f, 9.129f, 0.0f, 12.0f, 0.0f)
                curveToRelative(3.309f, 0.0f, 6.0f, 2.691f, 6.0f, 6.0f)
                curveToRelative(0.0f, 2.871f, -2.028f, 5.274f, -4.725f, 5.861f)
                lineToRelative(10.432f, 10.432f)
                curveToRelative(0.391f, 0.391f, 0.391f, 1.023f, 0.0f, 1.414f)
                close()
                moveTo(8.065f, 6.651f)
                lineToRelative(3.284f, 3.284f)
                curveToRelative(0.215f, 0.035f, 0.432f, 0.065f, 0.651f, 0.065f)
                curveToRelative(2.206f, 0.0f, 4.0f, -1.794f, 4.0f, -4.0f)
                reflectiveCurveToRelative(-1.794f, -4.0f, -4.0f, -4.0f)
                reflectiveCurveToRelative(-4.0f, 1.794f, -4.0f, 4.0f)
                curveToRelative(0.0f, 0.218f, 0.03f, 0.436f, 0.065f, 0.651f)
                close()
            }
        }
        .build()
        return _userSlash!!
    }

private var _userSlash: ImageVector? = null
