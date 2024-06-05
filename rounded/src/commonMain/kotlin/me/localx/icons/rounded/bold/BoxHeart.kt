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

public val Icons.Bold.BoxHeart: ImageVector
    get() {
        if (_boxHeart != null) {
            return _boxHeart!!
        }
        _boxHeart = Builder(name = "BoxHeart", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 5.5f)
                curveToRelative(0.0f, -3.033f, -2.467f, -5.5f, -5.5f, -5.5f)
                lineTo(5.5f, 0.0f)
                curveTo(2.467f, 0.0f, 0.0f, 2.467f, 0.0f, 5.5f)
                verticalLineToRelative(1.0f)
                curveToRelative(0.0f, 0.951f, 0.382f, 1.815f, 1.0f, 2.447f)
                verticalLineToRelative(9.553f)
                curveToRelative(0.0f, 3.033f, 2.467f, 5.5f, 5.5f, 5.5f)
                horizontalLineToRelative(11.0f)
                curveToRelative(3.033f, 0.0f, 5.5f, -2.467f, 5.5f, -5.5f)
                verticalLineToRelative(-9.553f)
                curveToRelative(0.618f, -0.632f, 1.0f, -1.495f, 1.0f, -2.447f)
                verticalLineToRelative(-1.0f)
                close()
                moveTo(3.0f, 5.5f)
                curveToRelative(0.0f, -1.378f, 1.122f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(13.0f)
                curveToRelative(1.378f, 0.0f, 2.5f, 1.122f, 2.5f, 2.5f)
                verticalLineToRelative(1.0f)
                curveToRelative(0.0f, 0.276f, -0.224f, 0.5f, -0.5f, 0.5f)
                lineTo(3.5f, 7.0f)
                curveToRelative(-0.276f, 0.0f, -0.5f, -0.224f, -0.5f, -0.5f)
                verticalLineToRelative(-1.0f)
                close()
                moveTo(17.5f, 21.0f)
                lineTo(6.5f, 21.0f)
                curveToRelative(-1.378f, 0.0f, -2.5f, -1.122f, -2.5f, -2.5f)
                verticalLineToRelative(-8.5f)
                horizontalLineToRelative(16.0f)
                verticalLineToRelative(8.5f)
                curveToRelative(0.0f, 1.378f, -1.122f, 2.5f, -2.5f, 2.5f)
                close()
                moveTo(16.0f, 14.2f)
                curveToRelative(0.0f, 1.643f, -2.034f, 3.553f, -3.201f, 4.514f)
                curveToRelative(-0.465f, 0.383f, -1.132f, 0.383f, -1.597f, 0.0f)
                curveToRelative(-1.167f, -0.961f, -3.201f, -2.871f, -3.201f, -4.514f)
                curveToRelative(0.0f, -1.215f, 0.895f, -2.2f, 2.0f, -2.2f)
                reflectiveCurveToRelative(2.0f, 0.985f, 2.0f, 2.2f)
                curveToRelative(0.0f, -1.215f, 0.895f, -2.2f, 2.0f, -2.2f)
                reflectiveCurveToRelative(2.0f, 0.985f, 2.0f, 2.2f)
                close()
            }
        }
        .build()
        return _boxHeart!!
    }

private var _boxHeart: ImageVector? = null
