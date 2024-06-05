package me.localx.icons.straight.bold

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

public val Icons.Bold.PlaneDeparture: ImageVector
    get() {
        if (_planeDeparture != null) {
            return _planeDeparture!!
        }
        _planeDeparture = Builder(name = "PlaneDeparture", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 24.0f)
                horizontalLineTo(0.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineTo(24.0f)
                verticalLineToRelative(3.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.891f, 18.731f)
                lineTo(1.258f, 14.305f)
                curveTo(0.369f, 13.673f, -0.083f, 12.688f, 0.013f, 11.646f)
                curveToRelative(0.096f, -1.043f, 0.721f, -1.929f, 1.671f, -2.369f)
                curveToRelative(0.704f, -0.326f, 1.492f, -0.357f, 2.219f, -0.091f)
                lineToRelative(2.815f, 1.033f)
                lineTo(15.311f, 5.749f)
                curveToRelative(1.324f, -0.69f, 2.834f, -0.814f, 4.253f, -0.348f)
                curveToRelative(1.419f, 0.466f, 2.563f, 1.461f, 3.221f, 2.802f)
                lineToRelative(1.215f, 2.473f)
                lineTo(7.891f, 18.731f)
                close()
                moveTo(3.633f, 12.283f)
                lineToRelative(4.474f, 2.985f)
                lineToRelative(11.878f, -5.939f)
                curveToRelative(-0.309f, -0.511f, -0.784f, -0.889f, -1.357f, -1.077f)
                curveToRelative(-0.644f, -0.21f, -1.332f, -0.155f, -1.932f, 0.157f)
                horizontalLineToRelative(0.0f)
                lineTo(6.929f, 13.493f)
                lineToRelative(-3.295f, -1.21f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.816f, 11.081f)
                lineTo(2.171f, 4.341f)
                lineToRelative(3.744f, -2.0f)
                curveToRelative(0.873f, -0.334f, 1.858f, -0.165f, 2.57f, 0.442f)
                lineToRelative(6.222f, 5.18f)
            }
        }
        .build()
        return _planeDeparture!!
    }

private var _planeDeparture: ImageVector? = null
