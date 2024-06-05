package me.localx.icons.straight.filled

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

public val Icons.Filled.Tags: ImageVector
    get() {
        if (_tags != null) {
            return _tags!!
        }
        _tags = Builder(name = "Tags", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.194f, 9.023f)
                lineTo(13.177f, 0.006f)
                lineTo(4.9f, 0.903f)
                lineToRelative(0.215f, 1.988f)
                lineToRelative(7.325f, -0.793f)
                lineToRelative(8.34f, 8.339f)
                curveToRelative(0.296f, 0.296f, 0.296f, 0.777f, -0.012f, 1.084f)
                lineToRelative(-0.962f, 0.994f)
                lineTo(11.099f, 3.808f)
                lineTo(1.962f, 5.057f)
                lineTo(0.953f, 14.18f)
                lineToRelative(9.013f, 9.012f)
                curveToRelative(0.521f, 0.521f, 1.213f, 0.808f, 1.95f, 0.808f)
                reflectiveCurveToRelative(1.43f, -0.287f, 1.962f, -0.819f)
                lineToRelative(6.244f, -6.449f)
                curveToRelative(0.665f, -0.665f, 0.916f, -1.588f, 0.759f, -2.451f)
                lineToRelative(1.314f, -1.357f)
                curveToRelative(1.075f, -1.076f, 1.075f, -2.826f, 0.0f, -3.901f)
                close()
                moveTo(6.0f, 10.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, -0.448f, -1.0f, -1.0f)
                curveToRelative(0.0f, -0.552f, 0.448f, -1.0f, 1.0f, -1.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.448f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.448f, 1.0f, -1.0f, 1.0f)
                close()
            }
        }
        .build()
        return _tags!!
    }

private var _tags: ImageVector? = null
