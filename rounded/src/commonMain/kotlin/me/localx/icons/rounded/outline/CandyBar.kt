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

public val Icons.Outline.CandyBar: ImageVector
    get() {
        if (_candyBar != null) {
            return _candyBar!!
        }
        _candyBar = Builder(name = "CandyBar", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.84f, 5.653f)
                curveToRelative(0.289f, -0.143f, 0.492f, -0.416f, 0.545f, -0.734f)
                curveToRelative(0.053f, -0.318f, -0.051f, -0.643f, -0.279f, -0.871f)
                lineToRelative(-2.489f, -2.489f)
                curveToRelative(-1.005f, -1.006f, -2.343f, -1.56f, -3.766f, -1.56f)
                reflectiveCurveToRelative(-2.76f, 0.554f, -3.766f, 1.56f)
                lineTo(2.56f, 11.085f)
                curveToRelative(-1.006f, 1.005f, -1.56f, 2.343f, -1.56f, 3.766f)
                reflectiveCurveToRelative(0.554f, 2.76f, 1.56f, 3.766f)
                lineToRelative(3.824f, 3.823f)
                curveToRelative(1.005f, 1.006f, 2.343f, 1.56f, 3.766f, 1.56f)
                reflectiveCurveToRelative(2.76f, -0.554f, 3.766f, -1.56f)
                lineToRelative(8.059f, -8.059f)
                curveToRelative(0.221f, -0.221f, 0.326f, -0.531f, 0.284f, -0.841f)
                curveToRelative(-0.042f, -0.309f, -0.226f, -0.581f, -0.496f, -0.735f)
                curveToRelative(-0.47f, -0.267f, -0.762f, -0.767f, -0.762f, -1.305f)
                curveToRelative(0.0f, -0.427f, 0.184f, -0.835f, 0.501f, -1.119f)
                curveToRelative(0.327f, -0.291f, 0.514f, -0.703f, 0.514f, -1.131f)
                reflectiveCurveToRelative(-0.187f, -0.84f, -0.513f, -1.13f)
                curveToRelative(-0.318f, -0.285f, -0.502f, -0.693f, -0.502f, -1.12f)
                curveToRelative(0.0f, -0.576f, 0.321f, -1.092f, 0.84f, -1.347f)
                close()
                moveTo(16.066f, 17.46f)
                lineToRelative(-3.591f, -3.591f)
                lineToRelative(3.273f, -3.273f)
                lineToRelative(3.576f, 3.576f)
                reflectiveCurveToRelative(0.01f, 0.009f, 0.015f, 0.014f)
                lineToRelative(-3.273f, 3.273f)
                close()
                moveTo(10.812f, 5.661f)
                lineToRelative(3.522f, 3.522f)
                lineToRelative(-3.273f, 3.273f)
                lineToRelative(-3.522f, -3.522f)
                lineToRelative(3.272f, -3.272f)
                close()
                moveTo(19.819f, 9.25f)
                curveToRelative(-0.429f, 0.512f, -0.704f, 1.137f, -0.79f, 1.8f)
                lineToRelative(-1.867f, -1.867f)
                lineToRelative(1.854f, -1.854f)
                curveToRelative(0.067f, 0.707f, 0.348f, 1.378f, 0.803f, 1.921f)
                close()
                moveTo(15.85f, 2.0f)
                curveToRelative(0.889f, 0.0f, 1.724f, 0.346f, 2.352f, 0.974f)
                lineToRelative(1.17f, 1.17f)
                lineToRelative(-3.625f, 3.624f)
                lineToRelative(-3.522f, -3.522f)
                lineToRelative(1.273f, -1.273f)
                curveToRelative(0.628f, -0.628f, 1.464f, -0.974f, 2.352f, -0.974f)
                close()
                moveTo(12.5f, 21.026f)
                curveToRelative(-1.256f, 1.257f, -3.447f, 1.257f, -4.703f, 0.0f)
                lineToRelative(-3.824f, -3.823f)
                curveToRelative(-0.628f, -0.628f, -0.974f, -1.463f, -0.974f, -2.352f)
                reflectiveCurveToRelative(0.346f, -1.724f, 0.974f, -2.352f)
                lineToRelative(2.151f, -2.151f)
                lineToRelative(8.527f, 8.527f)
                lineToRelative(-2.151f, 2.151f)
                close()
            }
        }
        .build()
        return _candyBar!!
    }

private var _candyBar: ImageVector? = null
