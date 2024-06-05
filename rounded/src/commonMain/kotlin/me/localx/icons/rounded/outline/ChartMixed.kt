package me.localx.icons.rounded.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.rounded.Icons

public val Icons.Outline.ChartMixed: ImageVector
    get() {
        if (_chartMixed != null) {
            return _chartMixed!!
        }
        _chartMixed = Builder(name = "ChartMixed", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 8.99f)
                curveToRelative(-0.88f, 0.0f, -1.76f, -0.33f, -2.42f, -1.0f)
                lineTo(0.29f, 5.71f)
                curveToRelative(-0.39f, -0.39f, -0.39f, -1.02f, 0.0f, -1.41f)
                reflectiveCurveToRelative(1.02f, -0.39f, 1.41f, 0.0f)
                lineToRelative(2.28f, 2.28f)
                curveToRelative(0.56f, 0.56f, 1.46f, 0.56f, 2.02f, 0.0f)
                lineToRelative(3.56f, -3.56f)
                curveToRelative(1.34f, -1.34f, 3.51f, -1.34f, 4.85f, 0.0f)
                lineToRelative(1.56f, 1.56f)
                curveToRelative(0.54f, 0.54f, 1.48f, 0.54f, 2.02f, 0.0f)
                lineTo(22.29f, 0.29f)
                curveToRelative(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0.0f)
                reflectiveCurveToRelative(0.39f, 1.02f, 0.0f, 1.41f)
                lineToRelative(-4.28f, 4.28f)
                curveToRelative(-1.29f, 1.29f, -3.55f, 1.29f, -4.85f, 0.0f)
                lineToRelative(-1.56f, -1.56f)
                curveToRelative(-0.56f, -0.56f, -1.46f, -0.56f, -2.02f, 0.0f)
                lineToRelative(-3.56f, 3.56f)
                curveToRelative(-0.67f, 0.67f, -1.55f, 1.0f, -2.42f, 1.0f)
                close()
                moveTo(8.0f, 23.0f)
                lineTo(8.0f, 14.0f)
                curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f)
                reflectiveCurveToRelative(-1.0f, 0.45f, -1.0f, 1.0f)
                verticalLineToRelative(9.0f)
                curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.45f, 1.0f, -1.0f)
                close()
                moveTo(3.0f, 23.0f)
                lineTo(3.0f, 12.0f)
                curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f)
                reflectiveCurveToRelative(-1.0f, 0.45f, -1.0f, 1.0f)
                verticalLineToRelative(11.0f)
                curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.45f, 1.0f, -1.0f)
                close()
                moveTo(13.0f, 23.0f)
                lineTo(13.0f, 9.0f)
                curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f)
                reflectiveCurveToRelative(-1.0f, 0.45f, -1.0f, 1.0f)
                verticalLineToRelative(14.0f)
                curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.45f, 1.0f, -1.0f)
                close()
                moveTo(18.0f, 23.0f)
                lineTo(18.0f, 12.0f)
                curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f)
                reflectiveCurveToRelative(-1.0f, 0.45f, -1.0f, 1.0f)
                verticalLineToRelative(11.0f)
                curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.45f, 1.0f, -1.0f)
                close()
                moveTo(23.0f, 23.0f)
                lineTo(23.0f, 8.0f)
                curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f)
                reflectiveCurveToRelative(-1.0f, 0.45f, -1.0f, 1.0f)
                verticalLineToRelative(15.0f)
                curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.45f, 1.0f, -1.0f)
                close()
            }
        }
        .build()
        return _chartMixed!!
    }

private var _chartMixed: ImageVector? = null
