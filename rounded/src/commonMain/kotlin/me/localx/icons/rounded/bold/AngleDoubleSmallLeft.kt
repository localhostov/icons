package me.localx.icons.rounded.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.rounded.Icons

public val Icons.Bold.AngleDoubleSmallLeft: ImageVector
    get() {
        if (_angleDoubleSmallLeft != null) {
            return _angleDoubleSmallLeft!!
        }
        _angleDoubleSmallLeft = Builder(name = "AngleDoubleSmallLeft", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.482f, 19.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -1.06f, -0.439f)
                lineTo(4.836f, 14.475f)
                arcToRelative(3.505f, 3.505f, 0.0f, false, true, 0.0f, -4.95f)
                lineTo(9.422f, 4.939f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 2.121f, 2.122f)
                lineTo(6.957f, 11.646f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, 0.708f)
                lineToRelative(4.586f, 4.585f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 10.482f, 19.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.482f, 19.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -1.06f, -0.439f)
                lineToRelative(-6.0f, -6.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.0f, -2.122f)
                lineToRelative(6.0f, -6.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 2.121f, 2.122f)
                lineTo(13.6f, 12.0f)
                lineToRelative(4.939f, 4.939f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 17.482f, 19.5f)
                close()
            }
        }
        .build()
        return _angleDoubleSmallLeft!!
    }

private var _angleDoubleSmallLeft: ImageVector? = null
