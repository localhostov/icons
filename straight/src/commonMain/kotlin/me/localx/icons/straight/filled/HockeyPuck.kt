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

public val Icons.Filled.HockeyPuck: ImageVector
    get() {
        if (_hockeyPuck != null) {
            return _hockeyPuck!!
        }
        _hockeyPuck = Builder(name = "HockeyPuck", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.051f, 7.792f)
                curveTo(0.562f, 3.436f, 5.721f, 0.0f, 12.0f, 0.0f)
                reflectiveCurveTo(23.438f, 3.436f, 23.949f, 7.792f)
                curveTo(23.438f, 11.821f, 18.279f, 15.0f, 12.0f, 15.0f)
                reflectiveCurveTo(0.562f, 11.821f, 0.051f, 7.792f)
                close()
                moveTo(12.0f, 17.0f)
                curveToRelative(-5.1f, 0.0f, -9.551f, -1.934f, -12.0f, -4.809f)
                verticalLineTo(15.5f)
                curveTo(0.0f, 20.187f, 5.383f, 24.0f, 12.0f, 24.0f)
                reflectiveCurveToRelative(12.0f, -3.813f, 12.0f, -8.5f)
                verticalLineTo(12.191f)
                curveTo(21.551f, 15.066f, 17.1f, 17.0f, 12.0f, 17.0f)
                close()
            }
        }
        .build()
        return _hockeyPuck!!
    }

private var _hockeyPuck: ImageVector? = null
