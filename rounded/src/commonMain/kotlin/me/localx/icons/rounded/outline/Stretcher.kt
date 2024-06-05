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

public val Icons.Outline.Stretcher: ImageVector
    get() {
        if (_stretcher != null) {
            return _stretcher!!
        }
        _stretcher = Builder(name = "Stretcher", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.5f, 19.0f)
                curveToRelative(-0.349f, 0.0f, -0.68f, 0.072f, -0.982f, 0.201f)
                lineToRelative(-4.038f, -3.701f)
                lineToRelative(4.909f, -4.5f)
                horizontalLineToRelative(1.611f)
                curveToRelative(0.553f, 0.0f, 1.0f, -0.447f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.447f, -1.0f, -1.0f, -1.0f)
                horizontalLineToRelative(-13.324f)
                curveToRelative(-1.34f, 0.0f, -2.584f, -0.666f, -3.328f, -1.781f)
                lineTo(1.832f, 0.446f)
                curveTo(1.526f, -0.014f, 0.906f, -0.138f, 0.446f, 0.168f)
                reflectiveCurveTo(-0.138f, 1.095f, 0.168f, 1.555f)
                lineToRelative(4.516f, 6.773f)
                curveToRelative(0.887f, 1.33f, 2.251f, 2.224f, 3.782f, 2.538f)
                lineToRelative(5.055f, 4.633f)
                lineToRelative(-4.038f, 3.701f)
                curveToRelative(-0.302f, -0.129f, -0.633f, -0.201f, -0.982f, -0.201f)
                curveToRelative(-1.381f, 0.0f, -2.5f, 1.119f, -2.5f, 2.5f)
                reflectiveCurveToRelative(1.119f, 2.5f, 2.5f, 2.5f)
                reflectiveCurveToRelative(2.5f, -1.119f, 2.5f, -2.5f)
                curveToRelative(0.0f, -0.295f, -0.06f, -0.573f, -0.154f, -0.836f)
                lineToRelative(4.154f, -3.808f)
                lineToRelative(4.154f, 3.808f)
                curveToRelative(-0.094f, 0.262f, -0.154f, 0.541f, -0.154f, 0.836f)
                curveToRelative(0.0f, 1.381f, 1.119f, 2.5f, 2.5f, 2.5f)
                reflectiveCurveToRelative(2.5f, -1.119f, 2.5f, -2.5f)
                reflectiveCurveToRelative(-1.119f, -2.5f, -2.5f, -2.5f)
                close()
                moveTo(11.571f, 11.0f)
                horizontalLineToRelative(6.858f)
                lineToRelative(-3.429f, 3.143f)
                lineToRelative(-3.429f, -3.143f)
                close()
            }
        }
        .build()
        return _stretcher!!
    }

private var _stretcher: ImageVector? = null
