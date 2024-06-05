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

public val Icons.Bold.LocationCrosshairsSlash: ImageVector
    get() {
        if (_locationCrosshairsSlash != null) {
            return _locationCrosshairsSlash!!
        }
        _locationCrosshairsSlash = Builder(name = "LocationCrosshairsSlash", defaultWidth =
                512.0.dp, defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 13.5f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-2.112f)
                curveToRelative(-0.652f, -4.315f, -4.072f, -7.736f, -8.388f, -8.388f)
                lineTo(13.5f, 0.0f)
                horizontalLineToRelative(-3.0f)
                lineTo(10.5f, 2.111f)
                curveToRelative(-1.609f, 0.241f, -3.124f, 0.868f, -4.432f, 1.836f)
                lineTo(2.161f, 0.039f)
                lineTo(0.04f, 2.16f)
                lineTo(21.839f, 23.961f)
                lineToRelative(2.121f, -2.121f)
                lineToRelative(-3.908f, -3.908f)
                curveToRelative(0.968f, -1.308f, 1.596f, -2.822f, 1.836f, -4.432f)
                horizontalLineToRelative(2.111f)
                close()
                moveTo(16.435f, 14.314f)
                curveToRelative(0.369f, -0.705f, 0.565f, -1.494f, 0.565f, -2.314f)
                curveToRelative(0.0f, -2.757f, -2.243f, -5.0f, -5.0f, -5.0f)
                curveToRelative(-0.818f, 0.0f, -1.607f, 0.196f, -2.313f, 0.565f)
                lineToRelative(-1.462f, -1.462f)
                curveToRelative(1.117f, -0.718f, 2.417f, -1.103f, 3.775f, -1.103f)
                curveToRelative(3.86f, 0.0f, 7.0f, 3.141f, 7.0f, 7.0f)
                curveToRelative(0.0f, 1.36f, -0.385f, 2.659f, -1.103f, 3.776f)
                lineToRelative(-1.462f, -1.462f)
                close()
                moveTo(16.144f, 21.094f)
                curveToRelative(-0.838f, 0.382f, -1.725f, 0.65f, -2.645f, 0.791f)
                verticalLineToRelative(2.115f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-2.112f)
                curveToRelative(-4.316f, -0.652f, -7.736f, -4.072f, -8.388f, -8.388f)
                lineTo(0.0f, 13.5f)
                verticalLineToRelative(-3.0f)
                lineTo(2.115f, 10.5f)
                curveToRelative(0.141f, -0.92f, 0.408f, -1.808f, 0.791f, -2.645f)
                lineToRelative(2.337f, 2.337f)
                curveToRelative(-0.155f, 0.583f, -0.242f, 1.188f, -0.242f, 1.808f)
                curveToRelative(0.0f, 3.859f, 3.14f, 7.0f, 7.0f, 7.0f)
                curveToRelative(0.62f, 0.0f, 1.225f, -0.087f, 1.808f, -0.242f)
                lineToRelative(2.337f, 2.337f)
                close()
            }
        }
        .build()
        return _locationCrosshairsSlash!!
    }

private var _locationCrosshairsSlash: ImageVector? = null
