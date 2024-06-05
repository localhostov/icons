package me.localx.icons.straight.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.straight.Icons

public val Icons.Outline.Marker: ImageVector
    get() {
        if (_marker != null) {
            return _marker!!
        }
        _marker = Builder(name = "Marker", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(255.104f, 512.171f)
                lineToRelative(-14.871f, -12.747f)
                curveTo(219.732f, 482.258f, 40.725f, 327.661f, 40.725f, 214.577f)
                curveToRelative(0.0f, -118.398f, 95.981f, -214.379f, 214.379f, -214.379f)
                reflectiveCurveToRelative(214.379f, 95.981f, 214.379f, 214.379f)
                curveToRelative(0.0f, 113.085f, -179.007f, 267.682f, -199.423f, 284.932f)
                lineTo(255.104f, 512.171f)
                close()
                moveTo(255.104f, 46.553f)
                curveToRelative(-92.753f, 0.105f, -167.918f, 75.27f, -168.023f, 168.023f)
                curveToRelative(0.0f, 71.042f, 110.132f, 184.53f, 168.023f, 236.473f)
                curveToRelative(57.892f, -51.964f, 168.023f, -165.517f, 168.023f, -236.473f)
                curveTo(423.022f, 121.823f, 347.858f, 46.659f, 255.104f, 46.553f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(255.104f, 299.555f)
                curveToRelative(-46.932f, 0.0f, -84.978f, -38.046f, -84.978f, -84.978f)
                reflectiveCurveToRelative(38.046f, -84.978f, 84.978f, -84.978f)
                reflectiveCurveToRelative(84.978f, 38.046f, 84.978f, 84.978f)
                reflectiveCurveTo(302.037f, 299.555f, 255.104f, 299.555f)
                close()
                moveTo(255.104f, 172.087f)
                curveToRelative(-23.466f, 0.0f, -42.489f, 19.023f, -42.489f, 42.489f)
                reflectiveCurveToRelative(19.023f, 42.489f, 42.489f, 42.489f)
                reflectiveCurveToRelative(42.489f, -19.023f, 42.489f, -42.489f)
                reflectiveCurveTo(278.571f, 172.087f, 255.104f, 172.087f)
                close()
            }
        }
        .build()
        return _marker!!
    }

private var _marker: ImageVector? = null
