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

public val Icons.Filled.LiveAlt: ImageVector
    get() {
        if (_liveAlt != null) {
            return _liveAlt!!
        }
        _liveAlt = Builder(name = "LiveAlt", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(18.364f, 4.636f)
                curveToRelative(-3.51f, -3.509f, -9.219f, -3.509f, -12.729f, 0.0f)
                lineToRelative(-1.414f, -1.414f)
                curveToRelative(4.289f, -4.289f, 11.268f, -4.289f, 15.557f, 0.0f)
                lineToRelative(-1.414f, 1.414f)
                close()
                moveTo(16.949f, 6.051f)
                curveToRelative(-1.322f, -1.322f, -3.079f, -2.05f, -4.949f, -2.05f)
                reflectiveCurveToRelative(-3.627f, 0.728f, -4.949f, 2.05f)
                lineToRelative(1.414f, 1.414f)
                curveToRelative(0.944f, -0.944f, 2.2f, -1.464f, 3.535f, -1.464f)
                reflectiveCurveToRelative(2.591f, 0.52f, 3.535f, 1.464f)
                lineToRelative(1.414f, -1.414f)
                close()
                moveTo(24.0f, 13.001f)
                verticalLineToRelative(11.0f)
                lineTo(0.0f, 24.001f)
                verticalLineToRelative(-11.0f)
                curveToRelative(0.0f, -1.654f, 1.346f, -3.0f, 3.0f, -3.0f)
                horizontalLineToRelative(18.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, 1.346f, 3.0f, 3.0f)
                close()
                moveTo(6.0f, 19.001f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-6.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(9.0f, 13.001f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-8.0f)
                close()
                moveTo(16.0f, 13.001f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(0.36f)
                lineToRelative(-1.0f, 3.5f)
                lineToRelative(-1.0f, -3.5f)
                verticalLineToRelative(-0.36f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(0.5f)
                lineToRelative(2.115f, 7.5f)
                horizontalLineToRelative(1.783f)
                lineToRelative(2.065f, -7.225f)
                lineToRelative(0.038f, -0.775f)
                close()
                moveTo(21.0f, 13.001f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.0f)
                close()
            }
        }
        .build()
        return _liveAlt!!
    }

private var _liveAlt: ImageVector? = null
