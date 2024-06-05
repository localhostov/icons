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

public val Icons.Filled.BowlingPins: ImageVector
    get() {
        if (_bowlingPins != null) {
            return _bowlingPins!!
        }
        _bowlingPins = Builder(name = "BowlingPins", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.569f, 6.343f)
                arcTo(6.729f, 6.729f, 0.0f, false, true, 14.8f, 3.7f)
                arcToRelative(3.7f, 3.7f, 0.0f, false, true, 7.4f, 0.0f)
                arcToRelative(6.729f, 6.729f, 0.0f, false, true, -0.769f, 2.643f)
                curveToRelative(-0.087f, 0.194f, -0.2f, 0.438f, -0.283f, 0.657f)
                horizontalLineToRelative(-5.3f)
                curveTo(15.765f, 6.781f, 15.656f, 6.537f, 15.569f, 6.343f)
                close()
                moveTo(21.336f, 9.0f)
                horizontalLineTo(15.664f)
                curveToRelative(-0.241f, 0.647f, -0.582f, 1.346f, -0.937f, 2.069f)
                arcTo(17.485f, 17.485f, 0.0f, false, false, 13.0f, 17.5f)
                arcTo(10.923f, 10.923f, 0.0f, false, false, 15.244f, 24.0f)
                horizontalLineToRelative(6.512f)
                arcTo(10.923f, 10.923f, 0.0f, false, false, 24.0f, 17.5f)
                arcToRelative(17.485f, 17.485f, 0.0f, false, false, -1.727f, -6.431f)
                curveTo(21.918f, 10.346f, 21.577f, 9.647f, 21.336f, 9.0f)
                close()
                moveTo(2.852f, 7.0f)
                horizontalLineToRelative(5.3f)
                curveToRelative(0.087f, -0.219f, 0.2f, -0.463f, 0.283f, -0.657f)
                arcTo(6.729f, 6.729f, 0.0f, false, false, 9.2f, 3.7f)
                arcToRelative(3.7f, 3.7f, 0.0f, true, false, -7.4f, 0.0f)
                arcToRelative(6.729f, 6.729f, 0.0f, false, false, 0.769f, 2.643f)
                curveTo(2.656f, 6.537f, 2.765f, 6.781f, 2.852f, 7.0f)
                close()
                moveTo(8.336f, 9.0f)
                horizontalLineTo(2.664f)
                curveToRelative(-0.241f, 0.647f, -0.582f, 1.346f, -0.937f, 2.069f)
                arcTo(17.485f, 17.485f, 0.0f, false, false, 0.0f, 17.5f)
                arcTo(10.923f, 10.923f, 0.0f, false, false, 2.244f, 24.0f)
                horizontalLineTo(8.756f)
                arcTo(10.923f, 10.923f, 0.0f, false, false, 11.0f, 17.5f)
                arcToRelative(17.485f, 17.485f, 0.0f, false, false, -1.727f, -6.431f)
                curveTo(8.918f, 10.346f, 8.577f, 9.647f, 8.336f, 9.0f)
                close()
            }
        }
        .build()
        return _bowlingPins!!
    }

private var _bowlingPins: ImageVector? = null
