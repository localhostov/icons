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

public val Icons.Outline.HouseFlag: ImageVector
    get() {
        if (_houseFlag != null) {
            return _houseFlag!!
        }
        _houseFlag = Builder(name = "HouseFlag", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 10.074f)
                verticalLineToRelative(1.076f)
                lineTo(12.674f, 2.233f)
                curveToRelative(-0.397f, -0.312f, -0.952f, -0.311f, -1.348f, 0.0f)
                lineTo(2.421f, 9.209f)
                curveToRelative(-0.264f, 0.207f, -0.421f, 0.53f, -0.421f, 0.865f)
                verticalLineToRelative(11.926f)
                horizontalLineToRelative(11.0f)
                verticalLineToRelative(2.0f)
                lineTo(0.0f, 24.0f)
                verticalLineToRelative(-13.926f)
                curveToRelative(0.0f, -0.958f, 0.433f, -1.847f, 1.187f, -2.439f)
                lineTo(10.092f, 0.659f)
                curveToRelative(1.123f, -0.881f, 2.693f, -0.881f, 3.816f, 0.0f)
                lineToRelative(8.905f, 6.977f)
                curveToRelative(0.754f, 0.592f, 1.187f, 1.48f, 1.187f, 2.439f)
                close()
                moveTo(22.0f, 22.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(-8.243f)
                lineToRelative(-2.0f, 1.01f)
                verticalLineToRelative(5.233f)
                close()
                moveTo(23.915f, 13.559f)
                lineToRelative(-6.915f, 3.494f)
                verticalLineToRelative(6.947f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-12.999f)
                curveToRelative(0.0f, -0.698f, 0.354f, -1.334f, 0.948f, -1.702f)
                curveToRelative(0.594f, -0.366f, 1.32f, -0.399f, 1.946f, -0.087f)
                lineToRelative(6.021f, 4.347f)
                close()
                moveTo(17.0f, 14.812f)
                lineToRelative(3.085f, -1.559f)
                lineToRelative(-3.085f, -2.235f)
                verticalLineToRelative(3.794f)
                close()
            }
        }
        .build()
        return _houseFlag!!
    }

private var _houseFlag: ImageVector? = null
