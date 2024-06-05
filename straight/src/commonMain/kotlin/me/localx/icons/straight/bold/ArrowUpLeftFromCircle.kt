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

public val Icons.Bold.ArrowUpLeftFromCircle: ImageVector
    get() {
        if (_arrowUpLeftFromCircle != null) {
            return _arrowUpLeftFromCircle!!
        }
        _arrowUpLeftFromCircle = Builder(name = "ArrowUpLeftFromCircle", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 5.121f)
                verticalLineToRelative(4.879f)
                lineTo(0.0f, 10.0f)
                lineTo(0.0f, 2.5f)
                curveTo(0.0f, 1.122f, 1.122f, 0.0f, 2.5f, 0.0f)
                horizontalLineToRelative(7.5f)
                lineTo(10.0f, 3.0f)
                lineTo(5.121f, 3.0f)
                lineToRelative(11.439f, 11.439f)
                lineToRelative(-2.121f, 2.121f)
                lineTo(3.0f, 5.121f)
                close()
                moveTo(14.0f, 4.0f)
                curveToRelative(-1.478f, 0.0f, -2.878f, 0.331f, -4.142f, 0.909f)
                lineToRelative(2.336f, 2.336f)
                curveToRelative(0.577f, -0.155f, 1.18f, -0.245f, 1.806f, -0.245f)
                curveToRelative(3.859f, 0.0f, 7.0f, 3.14f, 7.0f, 7.0f)
                reflectiveCurveToRelative(-3.141f, 7.0f, -7.0f, 7.0f)
                reflectiveCurveToRelative(-7.0f, -3.14f, -7.0f, -7.0f)
                curveToRelative(0.0f, -0.625f, 0.09f, -1.228f, 0.245f, -1.806f)
                lineToRelative(-2.336f, -2.336f)
                curveToRelative(-0.578f, 1.264f, -0.909f, 2.663f, -0.909f, 4.141f)
                curveToRelative(0.0f, 5.514f, 4.486f, 10.0f, 10.0f, 10.0f)
                reflectiveCurveToRelative(10.0f, -4.486f, 10.0f, -10.0f)
                reflectiveCurveTo(19.514f, 4.0f, 14.0f, 4.0f)
                close()
            }
        }
        .build()
        return _arrowUpLeftFromCircle!!
    }

private var _arrowUpLeftFromCircle: ImageVector? = null
