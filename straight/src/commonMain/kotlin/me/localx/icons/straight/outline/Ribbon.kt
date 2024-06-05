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

public val Icons.Outline.Ribbon: ImageVector
    get() {
        if (_ribbon != null) {
            return _ribbon!!
        }
        _ribbon = Builder(name = "Ribbon", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.988f, 18.727f)
                lineToRelative(-4.729f, -4.69f)
                lineToRelative(0.392f, -0.393f)
                curveToRelative(3.116f, -3.116f, 3.116f, -8.187f, 0.0f, -11.303f)
                curveToRelative(-1.51f, -1.51f, -3.517f, -2.341f, -5.651f, -2.341f)
                reflectiveCurveToRelative(-4.142f, 0.831f, -5.651f, 2.341f)
                curveToRelative(-3.116f, 3.116f, -3.116f, 8.187f, 0.0f, 11.303f)
                lineToRelative(0.32f, 0.32f)
                lineToRelative(-4.673f, 4.633f)
                lineToRelative(5.352f, 5.352f)
                lineToRelative(4.652f, -4.653f)
                lineToRelative(4.634f, 4.634f)
                lineToRelative(5.354f, -5.202f)
                close()
                moveTo(17.992f, 7.993f)
                curveToRelative(0.0f, 1.601f, -0.623f, 3.105f, -1.756f, 4.237f)
                lineToRelative(-0.397f, 0.398f)
                lineToRelative(-2.342f, -2.323f)
                curveToRelative(1.335f, -1.149f, 3.503f, -3.322f, 3.503f, -5.304f)
                curveToRelative(0.0f, -0.111f, -0.004f, -0.222f, -0.011f, -0.331f)
                curveToRelative(0.653f, 0.976f, 1.003f, 2.123f, 1.003f, 3.323f)
                close()
                moveTo(15.0f, 5.001f)
                curveToRelative(0.0f, 1.024f, -1.599f, 2.769f, -3.0f, 3.95f)
                curveToRelative(-1.401f, -1.182f, -3.0f, -2.926f, -3.0f, -3.95f)
                curveToRelative(0.0f, -1.654f, 1.346f, -3.0f, 3.0f, -3.0f)
                reflectiveCurveToRelative(3.0f, 1.346f, 3.0f, 3.0f)
                close()
                moveTo(6.008f, 7.993f)
                curveToRelative(0.0f, -1.201f, 0.351f, -2.347f, 1.003f, -3.323f)
                curveToRelative(-0.007f, 0.109f, -0.011f, 0.22f, -0.011f, 0.331f)
                curveToRelative(0.0f, 2.531f, 3.536f, 5.373f, 4.356f, 5.998f)
                lineToRelative(7.777f, 7.713f)
                lineToRelative(-2.479f, 2.409f)
                lineTo(7.763f, 12.229f)
                curveToRelative(-1.132f, -1.132f, -1.755f, -2.637f, -1.755f, -4.237f)
                close()
                moveTo(7.348f, 21.121f)
                lineToRelative(-2.518f, -2.518f)
                lineToRelative(3.253f, -3.225f)
                lineToRelative(2.503f, 2.503f)
                lineToRelative(-3.238f, 3.239f)
                close()
            }
        }
        .build()
        return _ribbon!!
    }

private var _ribbon: ImageVector? = null
