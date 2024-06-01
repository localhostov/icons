package me.localx.icons.rounded.outline

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

public val Icons.Outline.ArrowSmallRight: ImageVector
    get() {
        if (_arrowSmallRight != null) {
            return _arrowSmallRight!!
        }
        _arrowSmallRight = Builder(name = "ArrowSmallRight", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0001f, 11.9999f)
                curveTo(17.9952f, 11.4738f, 17.7832f, 10.9708f, 17.4101f, 10.5999f)
                lineTo(13.1201f, 6.3f)
                curveTo(12.9327f, 6.1137f, 12.6792f, 6.0092f, 12.4151f, 6.0092f)
                curveTo(12.1509f, 6.0092f, 11.8974f, 6.1137f, 11.7101f, 6.3f)
                curveTo(11.6163f, 6.3929f, 11.5419f, 6.5035f, 11.4912f, 6.6254f)
                curveTo(11.4404f, 6.7472f, 11.4143f, 6.8779f, 11.4143f, 7.01f)
                curveTo(11.4143f, 7.142f, 11.4404f, 7.2727f, 11.4912f, 7.3945f)
                curveTo(11.5419f, 7.5164f, 11.6163f, 7.627f, 11.7101f, 7.72f)
                lineTo(15.0001f, 10.9999f)
                horizontalLineTo(5.0001f)
                curveTo(4.7348f, 10.9999f, 4.4805f, 11.1053f, 4.293f, 11.2928f)
                curveTo(4.1054f, 11.4804f, 4.0001f, 11.7347f, 4.0001f, 11.9999f)
                curveTo(4.0001f, 12.2652f, 4.1054f, 12.5195f, 4.293f, 12.707f)
                curveTo(4.4805f, 12.8946f, 4.7348f, 12.9999f, 5.0001f, 12.9999f)
                horizontalLineTo(15.0001f)
                lineTo(11.7101f, 16.2899f)
                curveTo(11.5218f, 16.4769f, 11.4154f, 16.731f, 11.4145f, 16.9964f)
                curveTo(11.4136f, 17.2618f, 11.5181f, 17.5166f, 11.7051f, 17.7049f)
                curveTo(11.892f, 17.8932f, 12.1462f, 17.9996f, 12.4115f, 18.0005f)
                curveTo(12.6769f, 18.0014f, 12.9318f, 17.8969f, 13.1201f, 17.7099f)
                lineTo(17.4101f, 13.4099f)
                curveTo(17.7856f, 13.0366f, 17.9978f, 12.5295f, 18.0001f, 11.9999f)
                close()
            }
        }
        .build()
        return _arrowSmallRight!!
    }

private var _arrowSmallRight: ImageVector? = null
