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

public val Icons.Outline.Q: ImageVector
    get() {
        if (_q != null) {
            return _q!!
        }
        _q = Builder(name = "Q", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp, viewportWidth =
                24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.963f, 22.549f)
                lineToRelative(-2.791f, -2.791f)
                curveToRelative(1.151f, -1.629f, 1.828f, -3.616f, 1.828f, -5.758f)
                verticalLineToRelative(-4.0f)
                curveTo(22.0f, 4.486f, 17.514f, 0.0f, 12.0f, 0.0f)
                reflectiveCurveTo(2.0f, 4.486f, 2.0f, 10.0f)
                verticalLineToRelative(4.0f)
                curveToRelative(0.0f, 5.514f, 4.486f, 10.0f, 10.0f, 10.0f)
                curveToRelative(2.652f, 0.0f, 5.066f, -1.038f, 6.857f, -2.729f)
                lineToRelative(2.691f, 2.691f)
                lineToRelative(1.414f, -1.414f)
                close()
                moveTo(12.0f, 22.0f)
                curveToRelative(-4.411f, 0.0f, -8.0f, -3.589f, -8.0f, -8.0f)
                verticalLineToRelative(-4.0f)
                curveTo(4.0f, 5.589f, 7.589f, 2.0f, 12.0f, 2.0f)
                reflectiveCurveToRelative(8.0f, 3.589f, 8.0f, 8.0f)
                verticalLineToRelative(4.0f)
                curveToRelative(0.0f, 1.589f, -0.466f, 3.072f, -1.268f, 4.318f)
                lineToRelative(-2.281f, -2.281f)
                lineToRelative(-1.414f, 1.414f)
                lineToRelative(2.406f, 2.406f)
                curveToRelative(-1.429f, 1.329f, -3.343f, 2.143f, -5.443f, 2.143f)
                close()
            }
        }
        .build()
        return _q!!
    }

private var _q: ImageVector? = null
