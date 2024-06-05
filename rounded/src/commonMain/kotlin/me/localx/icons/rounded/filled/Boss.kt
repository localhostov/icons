package me.localx.icons.rounded.filled

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

public val Icons.Filled.Boss: ImageVector
    get() {
        if (_boss != null) {
            return _boss!!
        }
        _boss = Builder(name = "Boss", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.0f, 10.0f)
                curveToRelative(2.757f, 0.0f, 5.0f, -2.243f, 5.0f, -5.0f)
                reflectiveCurveTo(14.757f, 0.0f, 12.0f, 0.0f)
                reflectiveCurveToRelative(-5.0f, 2.243f, -5.0f, 5.0f)
                reflectiveCurveToRelative(2.243f, 5.0f, 5.0f, 5.0f)
                close()
                moveTo(14.413f, 11.38f)
                curveToRelative(2.639f, 0.839f, 4.689f, 3.011f, 5.352f, 5.724f)
                curveToRelative(0.111f, 0.454f, -0.232f, 0.896f, -0.7f, 0.896f)
                horizontalLineToRelative(-5.352f)
                lineToRelative(-1.116f, -3.897f)
                lineToRelative(1.816f, -2.723f)
                close()
                moveTo(4.234f, 17.104f)
                curveToRelative(0.663f, -2.713f, 2.713f, -4.885f, 5.352f, -5.724f)
                lineToRelative(1.816f, 2.723f)
                lineToRelative(-1.116f, 3.897f)
                horizontalLineToRelative(-5.352f)
                curveToRelative(-0.468f, 0.0f, -0.81f, -0.442f, -0.7f, -0.896f)
                close()
                moveTo(24.0f, 21.0f)
                curveToRelative(0.0f, 0.552f, -0.448f, 1.0f, -1.0f, 1.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(1.0f)
                curveToRelative(0.0f, 0.552f, -0.448f, 1.0f, -1.0f, 1.0f)
                lineTo(3.0f, 24.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, -0.448f, -1.0f, -1.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-1.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, -0.448f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.448f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(22.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.448f, 1.0f, 1.0f)
                close()
            }
        }
        .build()
        return _boss!!
    }

private var _boss: ImageVector? = null
