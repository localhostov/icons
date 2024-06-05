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

public val Icons.Bold.Procedures: ImageVector
    get() {
        if (_procedures != null) {
            return _procedures!!
        }
        _procedures = Builder(name = "Procedures", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 13.5f)
                verticalLineToRelative(9.0f)
                curveToRelative(0.0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                verticalLineToRelative(-1.5f)
                lineTo(3.0f, 21.0f)
                verticalLineToRelative(1.5f)
                curveToRelative(0.0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                lineTo(0.0f, 5.5f)
                curveToRelative(0.0f, -0.828f, 0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                verticalLineToRelative(10.5f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(-2.5f)
                curveToRelative(0.0f, -1.903f, 1.205f, -3.608f, 3.0f, -4.243f)
                curveToRelative(0.78f, -0.276f, 1.638f, 0.133f, 1.914f, 0.914f)
                reflectiveCurveToRelative(-0.133f, 1.638f, -0.914f, 1.914f)
                curveToRelative(-0.598f, 0.212f, -1.0f, 0.78f, -1.0f, 1.415f)
                verticalLineToRelative(2.5f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(-2.5f)
                curveToRelative(0.0f, -0.635f, -0.402f, -1.203f, -1.0f, -1.415f)
                curveToRelative(-0.781f, -0.276f, -1.19f, -1.133f, -0.914f, -1.914f)
                reflectiveCurveToRelative(1.134f, -1.19f, 1.914f, -0.914f)
                curveToRelative(1.795f, 0.635f, 3.0f, 2.34f, 3.0f, 4.243f)
                close()
                moveTo(9.0f, 13.5f)
                curveToRelative(0.0f, -1.381f, -1.119f, -2.5f, -2.5f, -2.5f)
                reflectiveCurveToRelative(-2.5f, 1.119f, -2.5f, 2.5f)
                reflectiveCurveToRelative(1.119f, 2.5f, 2.5f, 2.5f)
                reflectiveCurveToRelative(2.5f, -1.119f, 2.5f, -2.5f)
                close()
                moveTo(9.5f, 6.0f)
                horizontalLineToRelative(3.0f)
                curveToRelative(0.502f, 0.0f, 0.97f, -0.251f, 1.248f, -0.668f)
                lineToRelative(0.445f, -0.668f)
                lineToRelative(1.422f, 3.413f)
                curveToRelative(0.202f, 0.484f, 0.642f, 0.828f, 1.161f, 0.906f)
                curveToRelative(0.074f, 0.011f, 0.149f, 0.017f, 0.224f, 0.017f)
                curveToRelative(0.441f, 0.0f, 0.865f, -0.195f, 1.152f, -0.54f)
                lineToRelative(2.05f, -2.46f)
                horizontalLineToRelative(2.298f)
                curveToRelative(0.828f, 0.0f, 1.5f, -0.672f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.672f, -1.5f, -1.5f, -1.5f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(-0.445f, 0.0f, -0.867f, 0.197f, -1.152f, 0.54f)
                lineToRelative(-0.915f, 1.098f)
                lineToRelative(-1.548f, -3.715f)
                curveToRelative(-0.213f, -0.511f, -0.689f, -0.862f, -1.24f, -0.916f)
                curveToRelative(-0.556f, -0.056f, -1.085f, 0.201f, -1.393f, 0.661f)
                lineToRelative(-1.555f, 2.332f)
                horizontalLineToRelative(-2.197f)
                curveToRelative(-0.828f, 0.0f, -1.5f, 0.672f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.672f, 1.5f, 1.5f, 1.5f)
                close()
            }
        }
        .build()
        return _procedures!!
    }

private var _procedures: ImageVector? = null
