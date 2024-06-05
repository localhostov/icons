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

public val Icons.Bold.RugbyHelmet: ImageVector
    get() {
        if (_rugbyHelmet != null) {
            return _rugbyHelmet!!
        }
        _rugbyHelmet = Builder(name = "RugbyHelmet", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.933f, 14.056f)
                lineTo(22.605f, 13.0f)
                lineTo(13.193f, 13.0f)
                lineToRelative(0.608f, -1.7f)
                arcToRelative(0.4f, 0.4f, 0.0f, false, true, 0.285f, -0.3f)
                lineToRelative(4.4f, -0.48f)
                arcTo(2.941f, 2.941f, 0.0f, false, false, 20.819f, 6.6f)
                curveTo(19.373f, 2.651f, 15.253f, 0.0f, 10.568f, 0.0f)
                arcTo(10.58f, 10.58f, 0.0f, false, false, 0.0f, 10.568f)
                arcTo(48.789f, 48.789f, 0.0f, false, false, 0.769f, 16.8f)
                arcToRelative(3.391f, 3.391f, 0.0f, false, false, 2.414f, 2.7f)
                arcToRelative(33.455f, 33.455f, 0.0f, false, true, 8.033f, 3.33f)
                lineToRelative(1.016f, 0.623f)
                lineToRelative(2.716f, -2.757f)
                lineToRelative(1.869f, 2.088f)
                lineToRelative(0.284f, 0.131f)
                arcTo(13.421f, 13.421f, 0.0f, false, false, 22.5f, 24.0f)
                lineTo(24.0f, 24.0f)
                lineTo(24.0f, 22.5f)
                arcTo(31.0f, 31.0f, 0.0f, false, false, 22.933f, 14.056f)
                close()
                moveTo(11.747f, 19.665f)
                arcToRelative(38.642f, 38.642f, 0.0f, false, false, -7.718f, -3.049f)
                arcToRelative(0.413f, 0.413f, 0.0f, false, true, -0.3f, -0.32f)
                arcTo(45.22f, 45.22f, 0.0f, false, true, 3.0f, 10.568f)
                arcTo(7.577f, 7.577f, 0.0f, false, true, 10.568f, 3.0f)
                curveToRelative(3.421f, 0.0f, 6.4f, 1.849f, 7.43f, 4.554f)
                lineToRelative(-4.29f, 0.468f)
                arcToRelative(3.4f, 3.4f, 0.0f, false, false, -2.795f, 2.463f)
                lineTo(10.1f, 12.749f)
                arcToRelative(3.4f, 3.4f, 0.0f, false, false, 0.323f, 2.476f)
                lineToRelative(2.562f, 3.181f)
                close()
                moveTo(18.625f, 20.299f)
                lineTo(16.143f, 17.528f)
                lineTo(14.9f, 16.0f)
                lineTo(20.33f, 16.0f)
                arcToRelative(30.346f, 30.346f, 0.0f, false, true, 0.63f, 4.9f)
                arcTo(9.752f, 9.752f, 0.0f, false, true, 18.625f, 20.3f)
                close()
                moveTo(9.0f, 14.5f)
                arcTo(1.5f, 1.5f, 0.0f, true, true, 7.5f, 13.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 9.0f, 14.5f)
                close()
            }
        }
        .build()
        return _rugbyHelmet!!
    }

private var _rugbyHelmet: ImageVector? = null
