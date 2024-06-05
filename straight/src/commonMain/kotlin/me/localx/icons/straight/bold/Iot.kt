package me.localx.icons.straight.bold

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

public val Icons.Bold.Iot: ImageVector
    get() {
        if (_iot != null) {
            return _iot!!
        }
        _iot = Builder(name = "Iot", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(17.303f, 6.697f)
                lineToRelative(-2.121f, 2.121f)
                curveToRelative(-0.85f, -0.85f, -1.98f, -1.318f, -3.182f, -1.318f)
                reflectiveCurveToRelative(-2.332f, 0.468f, -3.182f, 1.318f)
                lineToRelative(-2.121f, -2.121f)
                curveToRelative(1.417f, -1.417f, 3.3f, -2.197f, 5.303f, -2.197f)
                reflectiveCurveToRelative(3.887f, 0.78f, 5.303f, 2.197f)
                close()
                moveTo(6.697f, 17.303f)
                curveToRelative(1.462f, 1.462f, 3.383f, 2.193f, 5.303f, 2.193f)
                reflectiveCurveToRelative(3.841f, -0.731f, 5.303f, -2.193f)
                lineToRelative(-2.121f, -2.121f)
                curveToRelative(-1.755f, 1.754f, -4.609f, 1.754f, -6.364f, 0.0f)
                lineToRelative(-2.121f, 2.121f)
                close()
                moveTo(18.364f, 5.636f)
                lineToRelative(2.121f, -2.121f)
                curveTo(15.807f, -1.164f, 8.194f, -1.164f, 3.515f, 3.515f)
                lineToRelative(2.121f, 2.121f)
                curveToRelative(3.51f, -3.509f, 9.218f, -3.509f, 12.728f, 0.0f)
                close()
                moveTo(5.636f, 18.364f)
                lineToRelative(-2.121f, 2.121f)
                curveToRelative(2.339f, 2.34f, 5.412f, 3.509f, 8.485f, 3.509f)
                reflectiveCurveToRelative(6.146f, -1.169f, 8.485f, -3.509f)
                lineToRelative(-2.121f, -2.121f)
                curveToRelative(-3.51f, 3.51f, -9.218f, 3.51f, -12.728f, 0.0f)
                close()
                moveTo(17.0f, 8.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-6.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-6.0f)
                close()
                moveTo(3.0f, 16.0f)
                horizontalLineToRelative(2.0f)
                lineTo(5.0f, 8.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(8.0f)
                close()
                moveTo(12.0f, 15.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, -1.346f, -3.0f, -3.0f)
                reflectiveCurveToRelative(1.346f, -3.0f, 3.0f, -3.0f)
                reflectiveCurveToRelative(3.0f, 1.346f, 3.0f, 3.0f)
                reflectiveCurveToRelative(-1.346f, 3.0f, -3.0f, 3.0f)
                close()
                moveTo(12.0f, 10.7f)
                curveToRelative(-0.717f, 0.0f, -1.3f, 0.583f, -1.3f, 1.3f)
                reflectiveCurveToRelative(0.583f, 1.301f, 1.3f, 1.301f)
                reflectiveCurveToRelative(1.3f, -0.584f, 1.3f, -1.301f)
                reflectiveCurveToRelative(-0.583f, -1.3f, -1.3f, -1.3f)
                close()
            }
        }
        .build()
        return _iot!!
    }

private var _iot: ImageVector? = null
