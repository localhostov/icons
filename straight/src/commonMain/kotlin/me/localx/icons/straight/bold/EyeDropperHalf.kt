package me.localx.icons.straight.bold

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

public val Icons.Bold.EyeDropperHalf: ImageVector
    get() {
        if (_eyeDropperHalf != null) {
            return _eyeDropperHalf!!
        }
        _eyeDropperHalf = Builder(name = "EyeDropperHalf", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.902f, 1.099f)
                curveToRelative(-1.417f, -1.419f, -3.887f, -1.415f, -5.303f, 0.0f)
                lineToRelative(-2.486f, 2.486f)
                curveToRelative(-1.338f, 1.338f, -3.462f, 1.366f, -4.837f, 0.07f)
                lineToRelative(-2.09f, 2.151f)
                lineToRelative(2.175f, 2.175f)
                lineTo(2.172f, 16.172f)
                curveToRelative(-1.185f, 1.185f, -1.469f, 2.933f, -0.854f, 4.389f)
                lineToRelative(-1.318f, 1.318f)
                lineToRelative(2.121f, 2.121f)
                lineToRelative(1.316f, -1.316f)
                curveToRelative(0.488f, 0.207f, 1.017f, 0.316f, 1.563f, 0.316f)
                curveToRelative(1.068f, 0.0f, 2.073f, -0.416f, 2.828f, -1.172f)
                lineToRelative(8.189f, -8.189f)
                lineToRelative(2.175f, 2.176f)
                lineToRelative(2.152f, -2.09f)
                curveToRelative(-1.297f, -1.375f, -1.266f, -3.501f, 0.071f, -4.838f)
                lineToRelative(2.486f, -2.486f)
                curveToRelative(0.708f, -0.708f, 1.098f, -1.649f, 1.098f, -2.651f)
                reflectiveCurveToRelative(-0.39f, -1.942f, -1.098f, -2.65f)
                close()
                moveTo(10.414f, 15.0f)
                horizontalLineToRelative(-2.828f)
                lineToRelative(4.896f, -4.897f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(-3.483f, 3.482f)
                close()
                moveTo(20.781f, 4.279f)
                lineToRelative(-2.487f, 2.486f)
                curveToRelative(-0.904f, 0.905f, -1.488f, 2.003f, -1.749f, 3.158f)
                lineToRelative(-2.468f, -2.468f)
                curveToRelative(1.154f, -0.262f, 2.252f, -0.846f, 3.157f, -1.75f)
                lineToRelative(2.487f, -2.486f)
                curveToRelative(0.191f, -0.191f, 0.414f, -0.22f, 0.53f, -0.22f)
                reflectiveCurveToRelative(0.339f, 0.028f, 0.53f, 0.22f)
                curveToRelative(0.191f, 0.191f, 0.219f, 0.414f, 0.219f, 0.529f)
                curveToRelative(0.0f, 0.116f, -0.028f, 0.339f, -0.219f, 0.53f)
                close()
            }
        }
        .build()
        return _eyeDropperHalf!!
    }

private var _eyeDropperHalf: ImageVector? = null
