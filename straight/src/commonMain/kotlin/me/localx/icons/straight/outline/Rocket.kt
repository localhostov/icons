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

public val Icons.Outline.Rocket: ImageVector
    get() {
        if (_rocket != null) {
            return _rocket!!
        }
        _rocket = Builder(name = "Rocket", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 7.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -1.0f, -1.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 18.0f, 7.0f)
                close()
                moveTo(14.0f, 9.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 1.0f, 1.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 14.0f, 9.0f)
                close()
                moveTo(11.0f, 12.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 1.0f, 1.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 11.0f, 12.0f)
                close()
                moveTo(23.352f, 0.648f)
                arcToRelative(2.189f, 2.189f, 0.0f, false, true, 0.514f, 2.31f)
                lineToRelative(-0.075f, 0.211f)
                curveTo(22.289f, 7.337f, 20.848f, 11.3f, 18.0f, 14.82f)
                lineTo(18.0f, 15.0f)
                arcToRelative(11.057f, 11.057f, 0.0f, false, true, -4.4f, 8.8f)
                lineToRelative(-0.268f, 0.2f)
                lineTo(9.0f, 24.0f)
                lineTo(9.0f, 20.414f)
                lineToRelative(-2.0f, -2.0f)
                lineTo(4.707f, 20.707f)
                lineTo(3.293f, 19.293f)
                lineTo(5.586f, 17.0f)
                lineToRelative(-2.0f, -2.0f)
                lineTo(0.0f, 15.0f)
                lineTo(0.0f, 10.44f)
                lineToRelative(0.2f, -0.266f)
                arcTo(10.81f, 10.81f, 0.0f, false, true, 9.0f, 6.0f)
                horizontalLineToRelative(0.18f)
                curveTo(12.7f, 3.153f, 16.66f, 1.712f, 20.826f, 0.211f)
                lineToRelative(0.216f, -0.077f)
                arcTo(2.189f, 2.189f, 0.0f, false, true, 23.352f, 0.648f)
                close()
                moveTo(2.0f, 13.0f)
                lineTo(3.419f, 13.0f)
                arcTo(31.578f, 31.578f, 0.0f, false, true, 6.8f, 8.243f)
                arcTo(8.493f, 8.493f, 0.0f, false, false, 2.0f, 11.118f)
                close()
                moveTo(15.7f, 17.254f)
                arcTo(31.718f, 31.718f, 0.0f, false, true, 11.0f, 20.581f)
                lineTo(11.0f, 22.0f)
                horizontalLineToRelative(1.657f)
                arcTo(9.052f, 9.052f, 0.0f, false, false, 15.7f, 17.254f)
                close()
                moveTo(21.937f, 2.063f)
                arcToRelative(0.191f, 0.191f, 0.0f, false, false, -0.217f, -0.048f)
                lineToRelative(-0.215f, 0.078f)
                curveTo(16.661f, 3.838f, 12.478f, 5.346f, 8.876f, 8.947f)
                arcTo(26.984f, 26.984f, 0.0f, false, false, 5.25f, 13.835f)
                lineToRelative(4.915f, 4.916f)
                arcToRelative(27.067f, 27.067f, 0.0f, false, false, 4.888f, -3.627f)
                curveToRelative(3.6f, -3.6f, 5.11f, -7.787f, 6.856f, -12.633f)
                lineToRelative(0.076f, -0.211f)
                arcTo(0.192f, 0.192f, 0.0f, false, false, 21.937f, 2.063f)
                close()
            }
        }
        .build()
        return _rocket!!
    }

private var _rocket: ImageVector? = null
