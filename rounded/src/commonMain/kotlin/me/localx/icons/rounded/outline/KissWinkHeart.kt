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

public val Icons.Outline.KissWinkHeart: ImageVector
    get() {
        if (_kissWinkHeart != null) {
            return _kissWinkHeart!!
        }
        _kissWinkHeart = Builder(name = "KissWinkHeart", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.867f, 19.964f)
                curveToRelative(-0.537f, 1.514f, -3.066f, 2.561f, -4.292f, 2.988f)
                arcToRelative(0.875f, 0.875f, 0.0f, false, true, -1.045f, -0.4f)
                curveToRelative(-0.666f, -1.151f, -1.938f, -3.651f, -1.4f, -5.166f)
                arcToRelative(1.876f, 1.876f, 0.0f, false, true, 2.366f, -1.28f)
                arcToRelative(1.991f, 1.991f, 0.0f, false, true, 1.0f, 2.569f)
                arcToRelative(1.878f, 1.878f, 0.0f, false, true, 2.366f, -1.281f)
                arcTo(1.994f, 1.994f, 0.0f, false, true, 23.867f, 19.964f)
                close()
                moveTo(14.932f, 21.564f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, true, 6.8f, -7.267f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.948f, 0.457f)
                arcTo(12.0f, 12.0f, 0.0f, true, false, 0.0f, 12.0f)
                arcTo(12.06f, 12.06f, 0.0f, false, false, 15.518f, 23.476f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.586f, -1.913f)
                close()
                moveTo(18.0f, 10.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -4.0f, 0.0f)
                curveToRelative(0.0f, 1.0f, 0.895f, 1.0f, 2.0f, 1.0f)
                reflectiveCurveTo(18.0f, 11.0f, 18.0f, 10.0f)
                close()
                moveTo(11.0f, 10.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, -1.0f)
                lineTo(7.0f, 9.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 2.0f)
                horizontalLineToRelative(3.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 11.0f, 10.0f)
                close()
                moveTo(15.0f, 14.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 12.5f, 12.0f)
                lineTo(10.769f, 12.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 2.0f)
                lineTo(12.5f, 14.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, 1.0f)
                lineTo(12.0f, 15.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 2.0f)
                horizontalLineToRelative(0.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, 1.0f)
                lineTo(10.769f, 18.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 2.0f)
                lineTo(12.5f, 20.0f)
                arcToRelative(2.507f, 2.507f, 0.0f, false, false, 1.987f, -4.0f)
                arcTo(2.471f, 2.471f, 0.0f, false, false, 15.0f, 14.5f)
                close()
            }
        }
        .build()
        return _kissWinkHeart!!
    }

private var _kissWinkHeart: ImageVector? = null
