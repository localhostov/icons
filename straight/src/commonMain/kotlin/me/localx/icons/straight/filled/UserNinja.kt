package me.localx.icons.straight.filled

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

public val Icons.Filled.UserNinja: ImageVector
    get() {
        if (_userNinja != null) {
            return _userNinja!!
        }
        _userNinja = Builder(name = "UserNinja", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(16.029f, 14.0f)
                curveToRelative(-0.634f, 1.458f, -1.897f, 3.996f, -4.034f, 6.903f)
                curveToRelative(-1.981f, -2.771f, -3.35f, -5.389f, -4.072f, -6.903f)
                horizontalLineToRelative(8.106f)
                close()
                moveTo(18.077f, 14.3f)
                curveToRelative(-0.622f, 1.523f, -2.086f, 4.642f, -4.829f, 8.264f)
                curveToRelative(0.384f, 0.482f, 0.787f, 0.961f, 1.207f, 1.436f)
                horizontalLineToRelative(6.546f)
                verticalLineToRelative(-5.5f)
                curveToRelative(0.0f, -1.925f, -1.22f, -3.558f, -2.923f, -4.2f)
                close()
                moveTo(5.863f, 14.319f)
                curveToRelative(-1.672f, 0.657f, -2.863f, 2.278f, -2.863f, 4.181f)
                verticalLineToRelative(5.5f)
                horizontalLineToRelative(8.835f)
                curveToRelative(-3.208f, -3.972f, -5.202f, -7.994f, -5.972f, -9.681f)
                close()
                moveTo(22.378f, 8.933f)
                reflectiveCurveToRelative(-2.093f, 0.34f, -3.312f, -0.518f)
                curveToRelative(-0.534f, -0.376f, -0.893f, -0.979f, -1.136f, -1.541f)
                curveToRelative(-0.424f, 2.898f, -2.913f, 5.126f, -5.929f, 5.126f)
                curveToRelative(-3.314f, 0.0f, -6.0f, -2.686f, -6.0f, -6.0f)
                reflectiveCurveTo(8.686f, 0.0f, 12.0f, 0.0f)
                curveToRelative(2.78f, 0.0f, 5.112f, 1.894f, 5.793f, 4.459f)
                curveToRelative(0.235f, -0.642f, 0.63f, -1.422f, 1.273f, -1.874f)
                curveToRelative(1.219f, -0.859f, 3.312f, -0.518f, 3.312f, -0.518f)
                curveToRelative(0.0f, 0.0f, -0.346f, 2.057f, -1.565f, 2.916f)
                curveToRelative(-0.42f, 0.296f, -0.943f, 0.443f, -1.449f, 0.517f)
                curveToRelative(0.506f, 0.074f, 1.029f, 0.222f, 1.449f, 0.517f)
                curveToRelative(1.219f, 0.859f, 1.565f, 2.916f, 1.565f, 2.916f)
                close()
                moveTo(15.5f, 5.499f)
                curveToRelative(0.0f, -0.828f, -0.672f, -1.5f, -1.5f, -1.5f)
                horizontalLineToRelative(-4.0f)
                curveToRelative(-0.828f, 0.0f, -1.5f, 0.672f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.672f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(4.0f)
                curveToRelative(0.828f, 0.0f, 1.5f, -0.672f, 1.5f, -1.5f)
                close()
            }
        }
        .build()
        return _userNinja!!
    }

private var _userNinja: ImageVector? = null
