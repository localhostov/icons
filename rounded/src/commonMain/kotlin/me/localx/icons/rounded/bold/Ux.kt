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

public val Icons.Bold.Ux: ImageVector
    get() {
        if (_ux != null) {
            return _ux!!
        }
        _ux = Builder(name = "Ux", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth =
                24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.0f, 8.25f)
                verticalLineToRelative(5.25f)
                curveToRelative(0.0f, 2.17f, -1.985f, 3.885f, -4.235f, 3.425f)
                curveToRelative(-1.636f, -0.335f, -2.765f, -1.854f, -2.765f, -3.525f)
                verticalLineToRelative(-5.15f)
                curveToRelative(0.0f, -0.69f, 0.56f, -1.25f, 1.25f, -1.25f)
                reflectiveCurveToRelative(1.25f, 0.56f, 1.25f, 1.25f)
                verticalLineToRelative(5.083f)
                curveToRelative(0.0f, 0.643f, 0.357f, 1.167f, 1.0f, 1.167f)
                reflectiveCurveToRelative(1.0f, -0.523f, 1.0f, -1.167f)
                verticalLineToRelative(-5.083f)
                curveToRelative(0.0f, -0.69f, 0.56f, -1.25f, 1.25f, -1.25f)
                reflectiveCurveToRelative(1.25f, 0.56f, 1.25f, 1.25f)
                close()
                moveTo(24.0f, 5.5f)
                verticalLineToRelative(13.0f)
                curveToRelative(0.0f, 3.033f, -2.468f, 5.5f, -5.5f, 5.5f)
                lineTo(5.5f, 24.0f)
                curveToRelative(-3.032f, 0.0f, -5.5f, -2.467f, -5.5f, -5.5f)
                lineTo(0.0f, 5.5f)
                curveTo(0.0f, 2.467f, 2.468f, 0.0f, 5.5f, 0.0f)
                horizontalLineToRelative(13.0f)
                curveToRelative(3.032f, 0.0f, 5.5f, 2.467f, 5.5f, 5.5f)
                close()
                moveTo(21.0f, 5.5f)
                curveToRelative(0.0f, -1.378f, -1.121f, -2.5f, -2.5f, -2.5f)
                lineTo(5.5f, 3.0f)
                curveToRelative(-1.379f, 0.0f, -2.5f, 1.122f, -2.5f, 2.5f)
                verticalLineToRelative(13.0f)
                curveToRelative(0.0f, 1.378f, 1.121f, 2.5f, 2.5f, 2.5f)
                horizontalLineToRelative(13.0f)
                curveToRelative(1.379f, 0.0f, 2.5f, -1.122f, 2.5f, -2.5f)
                lineTo(21.0f, 5.5f)
                close()
                moveTo(19.072f, 8.814f)
                curveToRelative(0.42f, -0.831f, -0.184f, -1.814f, -1.116f, -1.814f)
                curveToRelative(-0.647f, 0.0f, -1.037f, 0.265f, -1.25f, 0.686f)
                lineToRelative(-0.706f, 1.397f)
                lineToRelative(-0.006f, 0.012f)
                lineToRelative(-0.006f, -0.012f)
                lineToRelative(-0.706f, -1.397f)
                curveToRelative(-0.213f, -0.421f, -0.609f, -0.686f, -1.25f, -0.686f)
                curveToRelative(-0.932f, 0.0f, -1.536f, 0.982f, -1.116f, 1.814f)
                lineToRelative(1.604f, 3.174f)
                lineToRelative(0.006f, 0.012f)
                lineToRelative(-1.61f, 3.186f)
                curveToRelative(-0.42f, 0.831f, 0.184f, 1.814f, 1.116f, 1.814f)
                curveToRelative(0.695f, 0.0f, 1.037f, -0.265f, 1.25f, -0.686f)
                lineToRelative(0.712f, -1.409f)
                lineToRelative(0.712f, 1.409f)
                curveToRelative(0.213f, 0.421f, 0.596f, 0.686f, 1.25f, 0.686f)
                curveToRelative(0.932f, 0.0f, 1.536f, -0.982f, 1.116f, -1.814f)
                lineToRelative(-1.61f, -3.186f)
                lineToRelative(0.006f, -0.012f)
                lineToRelative(1.604f, -3.174f)
                close()
            }
        }
        .build()
        return _ux!!
    }

private var _ux: ImageVector? = null
