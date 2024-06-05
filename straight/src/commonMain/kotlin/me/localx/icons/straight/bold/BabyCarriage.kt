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

public val Icons.Bold.BabyCarriage: ImageVector
    get() {
        if (_babyCarriage != null) {
            return _babyCarriage!!
        }
        _babyCarriage = Builder(name = "BabyCarriage", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.478f, 0.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(9.022f)
                horizontalLineTo(5.191f)
                lineToRelative(-0.832f, -0.971f)
                arcTo(5.644f, 5.644f, 0.0f, false, false, 0.0f, 6.0f)
                verticalLineTo(9.0f)
                arcToRelative(2.663f, 2.663f, 0.0f, false, true, 2.064f, 0.983f)
                lineTo(3.0f, 11.077f)
                verticalLineTo(13.5f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 6.5f, 17.0f)
                horizontalLineToRelative(3.843f)
                lineToRelative(-1.7f, 2.014f)
                curveToRelative(-0.047f, 0.0f, -0.092f, -0.014f, -0.139f, -0.014f)
                arcTo(2.5f, 2.5f, 0.0f, true, false, 11.0f, 21.5f)
                arcToRelative(2.471f, 2.471f, 0.0f, false, false, -0.067f, -0.554f)
                lineTo(14.0f, 17.322f)
                lineToRelative(3.066f, 3.624f)
                arcTo(2.53f, 2.53f, 0.0f, false, false, 17.0f, 21.5f)
                arcTo(2.5f, 2.5f, 0.0f, true, false, 19.5f, 19.0f)
                curveToRelative(-0.048f, 0.0f, -0.092f, 0.011f, -0.139f, 0.014f)
                lineTo(17.657f, 17.0f)
                horizontalLineTo(19.5f)
                arcTo(4.505f, 4.505f, 0.0f, false, false, 24.0f, 12.5f)
                verticalLineTo(10.522f)
                curveTo(24.0f, 2.2f, 17.771f, 0.0f, 14.478f, 0.0f)
                close()
                moveTo(15.0f, 3.034f)
                arcToRelative(6.421f, 6.421f, 0.0f, false, true, 5.908f, 5.988f)
                horizontalLineTo(15.0f)
                close()
                moveTo(21.0f, 12.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 19.5f, 14.0f)
                horizontalLineTo(6.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.5f, -0.5f)
                verticalLineTo(12.022f)
                horizontalLineTo(21.0f)
                close()
            }
        }
        .build()
        return _babyCarriage!!
    }

private var _babyCarriage: ImageVector? = null
