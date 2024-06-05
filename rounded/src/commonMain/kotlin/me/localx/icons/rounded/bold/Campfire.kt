package me.localx.icons.rounded.bold

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

public val Icons.Bold.Campfire: ImageVector
    get() {
        if (_campfire != null) {
            return _campfire!!
        }
        _campfire = Builder(name = "Campfire", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.901f, 23.034f)
                curveToRelative(-0.228f, 0.598f, -0.797f, 0.966f, -1.401f, 0.966f)
                curveToRelative(-0.178f, 0.0f, -0.358f, -0.032f, -0.534f, -0.099f)
                lineToRelative(-9.966f, -3.797f)
                lineToRelative(-9.966f, 3.797f)
                curveToRelative(-0.176f, 0.067f, -0.356f, 0.099f, -0.534f, 0.099f)
                curveToRelative(-0.604f, 0.0f, -1.174f, -0.368f, -1.401f, -0.966f)
                curveToRelative(-0.295f, -0.774f, 0.093f, -1.641f, 0.867f, -1.936f)
                lineToRelative(6.82f, -2.598f)
                lineTo(0.966f, 15.902f)
                curveToRelative(-0.774f, -0.295f, -1.162f, -1.162f, -0.867f, -1.936f)
                curveToRelative(0.295f, -0.774f, 1.164f, -1.16f, 1.936f, -0.868f)
                lineToRelative(9.966f, 3.797f)
                lineToRelative(9.966f, -3.797f)
                curveToRelative(0.775f, -0.293f, 1.642f, 0.094f, 1.936f, 0.868f)
                curveToRelative(0.295f, 0.774f, -0.093f, 1.641f, -0.867f, 1.936f)
                lineToRelative(-6.82f, 2.598f)
                lineToRelative(6.82f, 2.598f)
                curveToRelative(0.774f, 0.295f, 1.162f, 1.162f, 0.867f, 1.936f)
                close()
                moveTo(6.375f, 9.881f)
                curveToRelative(-0.95f, -2.283f, 0.052f, -4.33f, 1.125f, -5.656f)
                curveToRelative(0.28f, -0.346f, 0.827f, -0.283f, 1.007f, 0.123f)
                curveToRelative(0.254f, 0.575f, -0.045f, 1.721f, 0.777f, 1.721f)
                curveToRelative(1.137f, 0.0f, 0.808f, -3.581f, 2.077f, -5.728f)
                curveToRelative(0.225f, -0.381f, 0.748f, -0.455f, 1.078f, -0.161f)
                curveToRelative(2.05f, 1.829f, 5.562f, 4.532f, 5.562f, 7.699f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.0f, 3.208f, -2.507f, 5.831f, -5.669f, 6.016f)
                curveToRelative(-2.642f, 0.155f, -4.939f, -1.57f, -5.956f, -4.014f)
                close()
                moveTo(10.433f, 11.34f)
                curveToRelative(0.813f, 0.948f, 2.271f, 0.948f, 3.083f, 0.0f)
                curveToRelative(0.703f, -0.819f, 0.566f, -2.072f, -0.197f, -2.835f)
                horizontalLineToRelative(0.0f)
                lineToRelative(-0.894f, -0.894f)
                curveToRelative(-0.249f, -0.249f, -0.652f, -0.249f, -0.901f, 0.0f)
                lineToRelative(-0.894f, 0.894f)
                curveToRelative(-0.763f, 0.763f, -0.899f, 2.015f, -0.197f, 2.835f)
                close()
            }
        }
        .build()
        return _campfire!!
    }

private var _campfire: ImageVector? = null
