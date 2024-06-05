package me.localx.icons.rounded.filled

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

public val Icons.Filled.Pipette: ImageVector
    get() {
        if (_pipette != null) {
            return _pipette!!
        }
        _pipette = Builder(name = "Pipette", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(20.678f, 7.393f)
                curveToRelative(-0.916f, 0.916f, -0.707f, 2.838f, 0.025f, 4.167f)
                arcToRelative(2.489f, 2.489f, 0.0f, false, true, -3.961f, 2.924f)
                lineToRelative(-7.226f, -7.226f)
                arcToRelative(2.489f, 2.489f, 0.0f, false, true, 2.924f, -3.958f)
                curveToRelative(1.329f, 0.731f, 3.251f, 0.941f, 4.167f, 0.025f)
                lineToRelative(2.479f, -2.482f)
                arcToRelative(2.947f, 2.947f, 0.0f, false, true, 4.071f, 0.0f)
                arcToRelative(2.88f, 2.88f, 0.0f, false, true, 0.0f, 4.075f)
                close()
                moveTo(1.969f, 17.347f)
                arcToRelative(3.307f, 3.307f, 0.0f, false, false, -0.585f, 3.853f)
                lineToRelative(-1.091f, 1.093f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 1.414f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.414f, 0.0f)
                lineToRelative(1.093f, -1.091f)
                arcToRelative(3.264f, 3.264f, 0.0f, false, false, 3.855f, -0.586f)
                lineToRelative(7.4f, -7.4f)
                lineToRelative(-4.682f, -4.686f)
                close()
            }
        }
        .build()
        return _pipette!!
    }

private var _pipette: ImageVector? = null
