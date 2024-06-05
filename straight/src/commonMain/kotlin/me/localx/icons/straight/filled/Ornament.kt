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

public val Icons.Filled.Ornament: ImageVector
    get() {
        if (_ornament != null) {
            return _ornament!!
        }
        _ornament = Builder(name = "Ornament", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.0f, 14.0f)
                curveToRelative(0.0f, 0.545f, -0.056f, 1.076f, -0.14f, 1.598f)
                lineToRelative(-5.012f, -5.012f)
                lineToRelative(-4.891f, 4.892f)
                lineToRelative(-4.659f, -4.659f)
                lineToRelative(-5.108f, 5.108f)
                curveToRelative(-0.122f, -0.624f, -0.19f, -1.267f, -0.19f, -1.926f)
                curveToRelative(0.0f, -4.092f, 2.473f, -7.613f, 6.0f, -9.159f)
                verticalLineToRelative(-1.841f)
                horizontalLineToRelative(2.275f)
                curveToRelative(-0.172f, -0.295f, -0.277f, -0.634f, -0.277f, -1.0f)
                curveToRelative(0.0f, -1.105f, 0.895f, -2.0f, 2.0f, -2.0f)
                reflectiveCurveToRelative(2.0f, 0.895f, 2.0f, 2.0f)
                curveToRelative(0.0f, 0.366f, -0.106f, 0.705f, -0.277f, 1.0f)
                horizontalLineToRelative(2.28f)
                verticalLineToRelative(1.841f)
                curveToRelative(3.527f, 1.547f, 6.0f, 5.068f, 6.0f, 9.159f)
                close()
                moveTo(11.957f, 18.306f)
                lineToRelative(-4.659f, -4.659f)
                lineToRelative(-4.423f, 4.423f)
                curveToRelative(1.563f, 3.489f, 5.061f, 5.93f, 9.125f, 5.93f)
                curveToRelative(4.166f, 0.0f, 7.741f, -2.562f, 9.242f, -6.192f)
                lineToRelative(-4.395f, -4.394f)
                lineToRelative(-4.891f, 4.892f)
                close()
            }
        }
        .build()
        return _ornament!!
    }

private var _ornament: ImageVector? = null
