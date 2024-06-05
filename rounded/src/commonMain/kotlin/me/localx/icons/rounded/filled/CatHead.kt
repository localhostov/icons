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

public val Icons.Filled.CatHead: ImageVector
    get() {
        if (_catHead != null) {
            return _catHead!!
        }
        _catHead = Builder(name = "CatHead", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.208f, 1.71f)
                curveToRelative(-0.092f, -0.76f, -0.604f, -1.372f, -1.334f, -1.599f)
                curveToRelative(-0.737f, -0.229f, -1.508f, -0.01f, -1.98f, 0.528f)
                lineToRelative(-1.699f, 1.734f)
                curveToRelative(-0.198f, 0.201f, -0.508f, 0.24f, -0.77f, 0.094f)
                curveToRelative(-1.791f, -0.992f, -3.664f, -1.5f, -5.442f, -1.468f)
                curveToRelative(-1.691f, 0.031f, -3.609f, 0.564f, -5.399f, 1.502f)
                curveToRelative(-0.258f, 0.134f, -0.562f, 0.093f, -0.753f, -0.103f)
                lineToRelative(-1.711f, -1.741f)
                curveTo(3.612f, 0.082f, 2.843f, -0.141f, 2.111f, 0.084f)
                curveToRelative(-0.729f, 0.221f, -1.245f, 0.828f, -1.344f, 1.585f)
                curveTo(0.41f, 4.395f, 0.0f, 8.203f, 0.0f, 13.499f)
                curveToRelative(0.0f, 5.79f, 4.741f, 10.501f, 10.567f, 10.501f)
                horizontalLineToRelative(2.933f)
                curveToRelative(5.79f, 0.0f, 10.5f, -4.709f, 10.5f, -10.498f)
                curveToRelative(0.0f, -5.293f, -0.477f, -9.211f, -0.792f, -11.792f)
                close()
                moveTo(6.0f, 10.5f)
                curveToRelative(0.0f, -0.828f, 0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                close()
                moveTo(15.001f, 19.0f)
                curveToRelative(-1.335f, -0.269f, -2.414f, -1.02f, -3.001f, -1.87f)
                curveToRelative(-0.587f, 0.85f, -1.666f, 1.601f, -3.001f, 1.87f)
                curveToRelative(-0.466f, 0.0f, -0.884f, -0.328f, -0.979f, -0.803f)
                curveToRelative(-0.109f, -0.541f, 0.242f, -1.068f, 0.783f, -1.178f)
                curveToRelative(1.417f, -0.285f, 1.915f, -1.43f, 2.093f, -2.227f)
                curveToRelative(-0.906f, -0.362f, -1.396f, -1.12f, -1.396f, -1.605f)
                curveToRelative(0.0f, -0.656f, 0.889f, -1.188f, 2.5f, -1.188f)
                reflectiveCurveToRelative(2.5f, 0.532f, 2.5f, 1.188f)
                curveToRelative(0.0f, 0.484f, -0.488f, 1.238f, -1.389f, 1.602f)
                curveToRelative(0.184f, 0.799f, 0.686f, 1.948f, 2.086f, 2.23f)
                curveToRelative(0.542f, 0.109f, 0.892f, 0.637f, 0.783f, 1.178f)
                curveToRelative(-0.096f, 0.475f, -0.513f, 0.803f, -0.979f, 0.803f)
                close()
                moveTo(16.5f, 12.0f)
                curveToRelative(-0.828f, 0.0f, -1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                close()
            }
        }
        .build()
        return _catHead!!
    }

private var _catHead: ImageVector? = null
