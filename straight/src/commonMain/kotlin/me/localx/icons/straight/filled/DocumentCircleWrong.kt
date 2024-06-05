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

public val Icons.Filled.DocumentCircleWrong: ImageVector
    get() {
        if (_documentCircleWrong != null) {
            return _documentCircleWrong!!
        }
        _documentCircleWrong = Builder(name = "DocumentCircleWrong", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(18.0f, 12.0f)
                curveToRelative(-3.314f, 0.0f, -6.0f, 2.686f, -6.0f, 6.0f)
                reflectiveCurveToRelative(2.686f, 6.0f, 6.0f, 6.0f)
                reflectiveCurveToRelative(6.0f, -2.686f, 6.0f, -6.0f)
                reflectiveCurveToRelative(-2.686f, -6.0f, -6.0f, -6.0f)
                close()
                moveTo(20.121f, 21.536f)
                lineToRelative(-2.121f, -2.121f)
                lineToRelative(-2.121f, 2.121f)
                lineToRelative(-1.414f, -1.414f)
                lineToRelative(2.121f, -2.121f)
                lineToRelative(-2.121f, -2.121f)
                lineToRelative(1.414f, -1.414f)
                lineToRelative(2.121f, 2.121f)
                lineToRelative(2.121f, -2.121f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(-2.121f, 2.121f)
                lineToRelative(2.121f, 2.121f)
                lineToRelative(-1.414f, 1.414f)
                close()
                moveTo(15.0f, 0.586f)
                verticalLineToRelative(4.414f)
                horizontalLineToRelative(4.414f)
                lineTo(15.0f, 0.586f)
                close()
                moveTo(12.721f, 24.0f)
                lineTo(0.0f, 24.0f)
                lineTo(0.0f, 3.0f)
                curveTo(0.0f, 1.343f, 1.343f, 0.0f, 3.0f, 0.0f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(3.262f)
                curveToRelative(-0.64f, -0.165f, -1.308f, -0.262f, -2.0f, -0.262f)
                curveToRelative(-4.418f, 0.0f, -8.0f, 3.582f, -8.0f, 8.0f)
                curveToRelative(0.0f, 2.393f, 1.056f, 4.534f, 2.721f, 6.0f)
                close()
            }
        }
        .build()
        return _documentCircleWrong!!
    }

private var _documentCircleWrong: ImageVector? = null
