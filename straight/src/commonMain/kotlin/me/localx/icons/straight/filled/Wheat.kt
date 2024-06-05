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

public val Icons.Filled.Wheat: ImageVector
    get() {
        if (_wheat != null) {
            return _wheat!!
        }
        _wheat = Builder(name = "Wheat", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.227f, 8.187f)
                lineTo(18.415f, 7.0f)
                curveToRelative(1.21f, 0.0f, 2.892f, -0.137f, 3.593f, -0.838f)
                curveTo(23.159f, 5.01f, 24.0f, 0.0f, 24.0f, 0.0f)
                reflectiveCurveToRelative(-5.01f, 0.84f, -6.161f, 1.992f)
                curveToRelative(-0.7f, 0.7f, -0.838f, 2.383f, -0.838f, 3.593f)
                lineTo(15.813f, 6.773f)
                arcTo(3.425f, 3.425f, 0.0f, false, false, 16.0f, 5.705f)
                curveTo(16.0f, 4.324f, 13.5f, 1.0f, 13.5f, 1.0f)
                reflectiveCurveTo(11.0f, 4.324f, 11.0f, 5.705f)
                curveToRelative(0.0f, 1.087f, 1.236f, 3.245f, 1.764f, 4.117f)
                lineToRelative(-1.951f, 1.951f)
                arcTo(3.425f, 3.425f, 0.0f, false, false, 11.0f, 10.705f)
                curveTo(11.0f, 9.324f, 8.5f, 6.0f, 8.5f, 6.0f)
                reflectiveCurveTo(6.0f, 9.324f, 6.0f, 10.705f)
                curveToRelative(0.0f, 1.087f, 1.236f, 3.245f, 1.764f, 4.117f)
                lineTo(5.813f, 16.773f)
                arcTo(3.425f, 3.425f, 0.0f, false, false, 6.0f, 15.705f)
                curveTo(6.0f, 14.324f, 3.5f, 11.0f, 3.5f, 11.0f)
                reflectiveCurveTo(1.0f, 14.324f, 1.0f, 15.705f)
                curveToRelative(0.0f, 1.087f, 1.236f, 3.245f, 1.764f, 4.117f)
                lineTo(0.043f, 22.543f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(2.721f, -2.721f)
                curveTo(5.05f, 21.764f, 7.208f, 23.0f, 8.3f, 23.0f)
                curveTo(9.676f, 23.0f, 13.0f, 20.5f, 13.0f, 20.5f)
                reflectiveCurveTo(9.676f, 18.0f, 8.3f, 18.0f)
                arcToRelative(3.425f, 3.425f, 0.0f, false, false, -1.068f, 0.187f)
                lineToRelative(1.951f, -1.951f)
                curveTo(10.05f, 16.764f, 12.208f, 18.0f, 13.3f, 18.0f)
                curveTo(14.676f, 18.0f, 18.0f, 15.5f, 18.0f, 15.5f)
                reflectiveCurveTo(14.676f, 13.0f, 13.3f, 13.0f)
                arcToRelative(3.425f, 3.425f, 0.0f, false, false, -1.068f, 0.187f)
                lineToRelative(1.951f, -1.951f)
                curveTo(15.05f, 11.764f, 17.208f, 13.0f, 18.3f, 13.0f)
                curveToRelative(1.381f, 0.0f, 4.7f, -2.5f, 4.7f, -2.5f)
                reflectiveCurveTo(19.676f, 8.0f, 18.3f, 8.0f)
                arcTo(3.425f, 3.425f, 0.0f, false, false, 17.227f, 8.187f)
                close()
            }
        }
        .build()
        return _wheat!!
    }

private var _wheat: ImageVector? = null
