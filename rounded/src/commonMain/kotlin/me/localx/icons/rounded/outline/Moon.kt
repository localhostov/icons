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

public val Icons.Outline.Moon: ImageVector
    get() {
        if (_moon != null) {
            return _moon!!
        }
        _moon = Builder(name = "Moon", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 24.0f)
                arcToRelative(12.021f, 12.021f, 0.0f, false, true, -8.914f, -3.966f)
                arcToRelative(11.9f, 11.9f, 0.0f, false, true, -3.02f, -9.309f)
                arcTo(12.122f, 12.122f, 0.0f, false, true, 13.085f, 0.152f)
                arcToRelative(13.061f, 13.061f, 0.0f, false, true, 5.031f, 0.205f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, 1.108f, 4.226f)
                curveToRelative(-4.56f, 4.166f, -4.164f, 10.644f, 0.807f, 14.41f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, -0.7f, 4.32f)
                arcTo(13.894f, 13.894f, 0.0f, false, true, 15.0f, 24.0f)
                close()
                moveTo(15.076f, 2.0f)
                arcToRelative(10.793f, 10.793f, 0.0f, false, false, -1.677f, 0.127f)
                arcToRelative(10.093f, 10.093f, 0.0f, false, false, -8.344f, 8.8f)
                arcTo(9.927f, 9.927f, 0.0f, false, false, 7.572f, 18.7f)
                arcTo(10.476f, 10.476f, 0.0f, false, false, 18.664f, 21.43f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.139f, -0.857f)
                curveToRelative(-5.929f, -4.478f, -6.4f, -12.486f, -0.948f, -17.449f)
                arcToRelative(0.459f, 0.459f, 0.0f, false, false, 0.128f, -0.466f)
                arcToRelative(0.49f, 0.49f, 0.0f, false, false, -0.356f, -0.361f)
                arcTo(10.657f, 10.657f, 0.0f, false, false, 15.076f, 2.0f)
                close()
            }
        }
        .build()
        return _moon!!
    }

private var _moon: ImageVector? = null
