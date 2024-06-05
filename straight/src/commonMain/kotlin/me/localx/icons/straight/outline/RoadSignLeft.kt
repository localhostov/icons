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

public val Icons.Outline.RoadSignLeft: ImageVector
    get() {
        if (_roadSignLeft != null) {
            return _roadSignLeft!!
        }
        _roadSignLeft = Builder(name = "RoadSignLeft", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(13.0f, 10.0f)
                horizontalLineToRelative(-4.086f)
                lineToRelative(2.293f, -2.293f)
                lineToRelative(-1.414f, -1.414f)
                lineToRelative(-3.302f, 3.301f)
                curveToRelative(-0.773f, 0.775f, -0.773f, 2.037f, 0.0f, 2.812f)
                lineToRelative(3.301f, 3.301f)
                lineToRelative(1.414f, -1.414f)
                lineToRelative(-2.304f, -2.293f)
                horizontalLineToRelative(4.097f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.448f, 1.0f, 1.0f)
                verticalLineToRelative(4.5f)
                lineToRelative(2.0f, -2.0f)
                verticalLineToRelative(-2.5f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                close()
                moveTo(23.052f, 9.703f)
                lineTo(14.297f, 0.948f)
                curveToRelative(-1.223f, -1.222f, -3.368f, -1.222f, -4.591f, 0.0f)
                lineTo(0.951f, 9.702f)
                curveToRelative(-0.613f, 0.613f, -0.951f, 1.429f, -0.951f, 2.296f)
                reflectiveCurveToRelative(0.338f, 1.683f, 0.951f, 2.295f)
                lineToRelative(8.755f, 8.756f)
                curveToRelative(0.633f, 0.633f, 1.464f, 0.949f, 2.295f, 0.949f)
                reflectiveCurveToRelative(1.663f, -0.316f, 2.296f, -0.949f)
                lineToRelative(8.755f, -8.755f)
                curveToRelative(0.613f, -0.613f, 0.951f, -1.429f, 0.951f, -2.296f)
                reflectiveCurveToRelative(-0.338f, -1.683f, -0.951f, -2.295f)
                close()
                moveTo(21.638f, 12.88f)
                lineToRelative(-8.755f, 8.755f)
                curveToRelative(-0.484f, 0.486f, -1.274f, 0.487f, -1.763f, 0.0f)
                lineTo(2.365f, 12.879f)
                curveToRelative(-0.235f, -0.235f, -0.365f, -0.548f, -0.365f, -0.881f)
                reflectiveCurveToRelative(0.13f, -0.646f, 0.365f, -0.881f)
                lineTo(11.12f, 2.362f)
                curveToRelative(0.233f, -0.233f, 0.547f, -0.362f, 0.881f, -0.362f)
                reflectiveCurveToRelative(0.648f, 0.129f, 0.882f, 0.362f)
                lineToRelative(8.755f, 8.755f)
                curveToRelative(0.235f, 0.235f, 0.365f, 0.548f, 0.365f, 0.881f)
                reflectiveCurveToRelative(-0.13f, 0.646f, -0.365f, 0.881f)
                close()
            }
        }
        .build()
        return _roadSignLeft!!
    }

private var _roadSignLeft: ImageVector? = null
