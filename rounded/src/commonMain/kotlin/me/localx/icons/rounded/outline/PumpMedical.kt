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

public val Icons.Outline.PumpMedical: ImageVector
    get() {
        if (_pumpMedical != null) {
            return _pumpMedical!!
        }
        _pumpMedical = Builder(name = "PumpMedical", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.555f, 2.168f)
                lineToRelative(-0.732f, -0.488f)
                curveToRelative(-1.648f, -1.099f, -3.566f, -1.68f, -5.547f, -1.68f)
                horizontalLineToRelative(-4.775f)
                curveToRelative(-1.93f, 0.0f, -3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(2.793f)
                curveToRelative(-2.978f, 1.209f, -5.0f, 4.158f, -5.0f, 7.417f)
                verticalLineToRelative(5.29f)
                curveToRelative(0.0f, 2.757f, 2.243f, 5.0f, 5.0f, 5.0f)
                horizontalLineToRelative(6.0f)
                curveToRelative(2.757f, 0.0f, 5.0f, -2.243f, 5.0f, -5.0f)
                verticalLineToRelative(-5.29f)
                curveToRelative(0.0f, -3.259f, -2.022f, -6.208f, -5.0f, -7.417f)
                lineTo(15.001f, 2.0f)
                horizontalLineToRelative(2.275f)
                curveToRelative(1.584f, 0.0f, 3.118f, 0.465f, 4.438f, 1.344f)
                lineToRelative(0.732f, 0.488f)
                curveToRelative(0.46f, 0.305f, 1.08f, 0.182f, 1.387f, -0.277f)
                curveToRelative(0.307f, -0.46f, 0.183f, -1.08f, -0.277f, -1.387f)
                close()
                moveTo(11.0f, 3.5f)
                curveToRelative(0.0f, -0.827f, 0.673f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(0.5f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-2.5f)
                close()
                moveTo(18.0f, 13.71f)
                verticalLineToRelative(5.29f)
                curveToRelative(0.0f, 1.654f, -1.346f, 3.0f, -3.0f, 3.0f)
                horizontalLineToRelative(-6.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, -1.346f, -3.0f, -3.0f)
                verticalLineToRelative(-5.29f)
                curveToRelative(0.0f, -2.589f, 1.699f, -4.916f, 4.151f, -5.71f)
                horizontalLineToRelative(3.699f)
                curveToRelative(2.451f, 0.794f, 4.151f, 3.121f, 4.151f, 5.71f)
                close()
                moveTo(15.0f, 14.0f)
                curveToRelative(0.553f, 0.0f, 1.0f, 0.447f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.447f, 1.0f, -1.0f, 1.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 0.553f, -0.447f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.447f, -1.0f, -1.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(-0.553f, 0.0f, -1.0f, -0.447f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.447f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -0.553f, 0.447f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.447f, 1.0f, 1.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                close()
            }
        }
        .build()
        return _pumpMedical!!
    }

private var _pumpMedical: ImageVector? = null
