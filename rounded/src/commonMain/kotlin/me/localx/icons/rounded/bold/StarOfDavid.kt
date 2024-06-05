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

public val Icons.Bold.StarOfDavid: ImageVector
    get() {
        if (_starOfDavid != null) {
            return _starOfDavid!!
        }
        _starOfDavid = Builder(name = "StarOfDavid", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(19.979f, 12.0f)
                lineToRelative(2.811f, -4.734f)
                curveToRelative(0.275f, -0.463f, 0.281f, -1.039f, 0.014f, -1.508f)
                curveToRelative(-0.267f, -0.468f, -0.765f, -0.758f, -1.304f, -0.758f)
                horizontalLineToRelative(-5.678f)
                lineTo(13.29f, 0.734f)
                curveToRelative(-0.27f, -0.456f, -0.76f, -0.734f, -1.29f, -0.734f)
                reflectiveCurveToRelative(-1.02f, 0.279f, -1.29f, 0.734f)
                lineToRelative(-2.533f, 4.266f)
                lineTo(2.5f, 5.0f)
                curveToRelative(-0.539f, 0.0f, -1.037f, 0.29f, -1.304f, 0.758f)
                curveToRelative(-0.267f, 0.469f, -0.261f, 1.044f, 0.014f, 1.508f)
                lineToRelative(2.811f, 4.734f)
                lineToRelative(-2.811f, 4.734f)
                curveToRelative(-0.275f, 0.463f, -0.281f, 1.039f, -0.014f, 1.508f)
                curveToRelative(0.267f, 0.468f, 0.765f, 0.758f, 1.304f, 0.758f)
                horizontalLineToRelative(5.678f)
                lineToRelative(2.533f, 4.266f)
                curveToRelative(0.27f, 0.456f, 0.76f, 0.734f, 1.29f, 0.734f)
                reflectiveCurveToRelative(1.02f, -0.279f, 1.29f, -0.734f)
                lineToRelative(2.533f, -4.266f)
                horizontalLineToRelative(5.678f)
                curveToRelative(0.539f, 0.0f, 1.037f, -0.29f, 1.304f, -0.758f)
                curveToRelative(0.267f, -0.469f, 0.261f, -1.044f, -0.014f, -1.508f)
                lineToRelative(-2.811f, -4.734f)
                close()
                moveTo(17.613f, 12.0f)
                lineToRelative(-2.969f, 5.0f)
                horizontalLineToRelative(-5.287f)
                lineToRelative(-2.969f, -5.0f)
                lineToRelative(2.969f, -5.0f)
                horizontalLineToRelative(5.287f)
                lineToRelative(2.969f, 5.0f)
                close()
            }
        }
        .build()
        return _starOfDavid!!
    }

private var _starOfDavid: ImageVector? = null
