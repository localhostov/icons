package me.localx.icons.straight.outline

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

public val Icons.Outline.AnglesUpDown: ImageVector
    get() {
        if (_anglesUpDown != null) {
            return _anglesUpDown!!
        }
        _anglesUpDown = Builder(name = "AnglesUpDown", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(3.271f, 10.096f)
                lineToRelative(-1.398f, -1.431f)
                lineTo(9.824f, 0.892f)
                curveToRelative(0.574f, -0.573f, 1.348f, -0.892f, 2.172f, -0.892f)
                horizontalLineToRelative(0.006f)
                curveToRelative(0.821f, 0.001f, 1.594f, 0.321f, 2.176f, 0.899f)
                lineToRelative(7.95f, 7.766f)
                lineToRelative(-1.398f, 1.431f)
                lineToRelative(-7.956f, -7.772f)
                curveToRelative(-0.211f, -0.21f, -0.484f, -0.323f, -0.775f, -0.324f)
                horizontalLineToRelative(-0.002f)
                curveToRelative(-0.29f, 0.0f, -0.562f, 0.112f, -0.767f, 0.315f)
                lineToRelative(-7.959f, 7.781f)
                close()
                moveTo(12.769f, 21.681f)
                curveToRelative(-0.206f, 0.205f, -0.479f, 0.317f, -0.771f, 0.318f)
                horizontalLineToRelative(-0.002f)
                curveToRelative(-0.29f, 0.0f, -0.562f, -0.112f, -0.773f, -0.322f)
                lineToRelative(-7.952f, -7.773f)
                lineToRelative(-1.398f, 1.43f)
                lineToRelative(7.945f, 7.767f)
                curveToRelative(0.581f, 0.58f, 1.354f, 0.899f, 2.179f, 0.899f)
                horizontalLineToRelative(0.006f)
                curveToRelative(0.82f, -0.002f, 1.593f, -0.32f, 2.17f, -0.894f)
                lineToRelative(7.956f, -7.772f)
                lineToRelative(-1.398f, -1.43f)
                lineToRelative(-7.961f, 7.777f)
                close()
            }
        }
        .build()
        return _anglesUpDown!!
    }

private var _anglesUpDown: ImageVector? = null
