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

public val Icons.Filled.TogetherPeople: ImageVector
    get() {
        if (_togetherPeople != null) {
            return _togetherPeople!!
        }
        _togetherPeople = Builder(name = "TogetherPeople", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(16.5f, 2.5f)
                curveToRelative(0.0f, -1.381f, 1.119f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.119f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.119f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.119f, -2.5f, -2.5f)
                close()
                moveTo(5.0f, 5.0f)
                curveToRelative(1.381f, 0.0f, 2.5f, -1.119f, 2.5f, -2.5f)
                reflectiveCurveTo(6.381f, 0.0f, 5.0f, 0.0f)
                reflectiveCurveToRelative(-2.5f, 1.119f, -2.5f, 2.5f)
                reflectiveCurveToRelative(1.119f, 2.5f, 2.5f, 2.5f)
                close()
                moveTo(11.0f, 11.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-2.333f)
                lineToRelative(-2.75f, 2.75f)
                curveToRelative(-0.322f, 0.322f, -0.322f, 0.844f, 0.0f, 1.166f)
                lineToRelative(2.75f, 2.75f)
                verticalLineToRelative(-2.333f)
                close()
                moveTo(15.848f, 15.397f)
                lineToRelative(-2.848f, -2.848f)
                verticalLineToRelative(2.451f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(2.451f)
                lineToRelative(2.848f, -2.848f)
                curveToRelative(0.333f, -0.333f, 0.333f, -0.874f, 0.0f, -1.207f)
                close()
                moveTo(6.008f, 10.0f)
                curveToRelative(0.0f, -0.754f, 0.294f, -1.463f, 0.828f, -1.997f)
                lineToRelative(1.613f, -1.613f)
                curveToRelative(-0.432f, -0.241f, -0.921f, -0.39f, -1.449f, -0.39f)
                lineTo(3.0f, 6.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, 1.346f, -3.0f, 3.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-7.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-10.839f)
                lineToRelative(-1.164f, -1.164f)
                curveToRelative(-0.533f, -0.532f, -0.828f, -1.242f, -0.828f, -1.997f)
                close()
                moveTo(21.0f, 6.0f)
                horizontalLineToRelative(-4.0f)
                curveToRelative(-0.352f, 0.0f, -0.686f, 0.072f, -1.0f, 0.184f)
                verticalLineToRelative(6.536f)
                lineToRelative(1.263f, 1.263f)
                curveToRelative(1.11f, 1.112f, 1.11f, 2.921f, 0.0f, 4.033f)
                lineToRelative(-1.263f, 1.263f)
                verticalLineToRelative(4.721f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-7.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-7.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-8.0f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                close()
            }
        }
        .build()
        return _togetherPeople!!
    }

private var _togetherPeople: ImageVector? = null
