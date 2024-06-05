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

public val Icons.Outline.CloudCheck: ImageVector
    get() {
        if (_cloudCheck != null) {
            return _cloudCheck!!
        }
        _cloudCheck = Builder(name = "CloudCheck", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(11.692f, 23.0f)
                arcToRelative(2.98f, 2.98f, 0.0f, false, true, -2.121f, -0.879f)
                lineToRelative(-3.387f, -3.421f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 1.416f, -1.4f)
                lineToRelative(3.384f, 3.414f)
                arcToRelative(1.025f, 1.025f, 0.0f, false, false, 1.411f, 0.0f)
                lineToRelative(5.414f, -5.414f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.415f, 1.414f)
                lineToRelative(-5.415f, 5.414f)
                arcToRelative(2.976f, 2.976f, 0.0f, false, true, -2.117f, 0.872f)
                close()
                moveTo(7.0f, 22.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, -1.0f)
                horizontalLineToRelative(-0.317f)
                arcToRelative(3.81f, 3.81f, 0.0f, false, true, -3.646f, -2.982f)
                arcToRelative(3.468f, 3.468f, 0.0f, false, true, 1.835f, -3.6f)
                arcToRelative(1.994f, 1.994f, 0.0f, false, false, 0.792f, -2.686f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, 11.06f, -4.513f)
                arcToRelative(3.1f, 3.1f, 0.0f, false, false, 2.044f, 2.053f)
                arcToRelative(5.971f, 5.971f, 0.0f, false, true, 4.213f, 6.211f)
                arcToRelative(5.845f, 5.845f, 0.0f, false, true, -4.293f, 5.076f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.624f, 1.9f)
                arcToRelative(7.858f, 7.858f, 0.0f, false, false, 0.044f, -15.1f)
                arcToRelative(1.09f, 1.09f, 0.0f, false, true, -0.722f, -0.735f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -15.49f, 0.842f)
                arcToRelative(7.652f, 7.652f, 0.0f, false, false, 0.8f, 5.18f)
                arcToRelative(5.443f, 5.443f, 0.0f, false, false, -2.887f, 5.654f)
                arcToRelative(5.843f, 5.843f, 0.0f, false, false, 5.626f, 4.7f)
                horizontalLineToRelative(0.317f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, -1.0f)
                close()
            }
        }
        .build()
        return _cloudCheck!!
    }

private var _cloudCheck: ImageVector? = null
